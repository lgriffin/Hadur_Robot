// Writes the fitted Sanara class as bytecode (docs/sanara.md, "The fit"). Build: javac -cp asm-9.7.1.jar Gen.java
// Run: java -cp asm-9.7.1.jar:. Gen OUT.class LIST ROUND POWER N14 NOADJ K [IDEAL CHANCE [SCALE]]; with SCALE, LIST is the chance string from layout.py
import org.objectweb.asm.*;
import java.nio.file.*;
import static org.objectweb.asm.Opcodes.*;

/** Hand-written bytecode for the fitted Sanara screens. */
public class Gen {
    static final int I = 2, N = 3, K = 3, D = 4, A = 6;
    static final String C = "hadur117/nano/Sanara", SRE = "robocode/ScannedRobotEvent", AR = "robocode/AdvancedRobot";
    public static void main(String[] a) throws Exception {
        double scale = a.length > 9 ? Double.parseDouble(a[9]) : 0;
        String list = scale > 0 ? new String(Files.readAllBytes(Paths.get(a[1])), "UTF-8")
            : String.join("|", Files.readAllLines(Paths.get(a[1])).stream().filter(s -> !s.startsWith("#") && !s.isEmpty()).toArray(String[]::new));
        boolean round = a[2].equals("1"), power = a[3].equals("1"), n14 = a.length > 4 && a[4].equals("1"), adj = !(a.length > 5 && a[5].equals("1"));
        int k = a.length > 6 ? Integer.parseInt(a[6]) : 0; double ideal = a.length > 7 ? Double.parseDouble(a[7]) : 300, chance = a.length > 8 ? Double.parseDouble(a[8]) : 0.6; // power k / d (clamped to 3 by the engine), flight from d / 14
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(V1_5, ACC_PUBLIC | ACC_SUPER, C, null, AR, null);
        cw.visitField(ACC_STATIC, "h", "Ljava/lang/String;", null, null);
        cw.visitField(ACC_STATIC, "E", "D", null, null);
        cw.visitField(ACC_STATIC, "dir", "D", null, null);
        MethodVisitor m;
        // <init>
        m = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        m.visitVarInsn(ALOAD, 0); m.visitMethodInsn(INVOKESPECIAL, AR, "<init>", "()V", false); m.visitInsn(RETURN); m.visitMaxs(0, 0); m.visitEnd();
        // <clinit>
        m = cw.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
        m.visitLdcInsn("\0".repeat(40)); m.visitFieldInsn(PUTSTATIC, C, "h", "Ljava/lang/String;");
        m.visitLdcInsn(600.0); m.visitFieldInsn(PUTSTATIC, C, "dir", "D");
        m.visitInsn(RETURN); m.visitMaxs(0, 0); m.visitEnd();
        // run
        m = cw.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
        if (adj) { m.visitVarInsn(ALOAD, 0); m.visitInsn(ICONST_1); m.visitMethodInsn(INVOKEVIRTUAL, C, "setAdjustGunForRobotTurn", "(Z)V", false); }
        m.visitVarInsn(ALOAD, 0); m.visitInsn(ICONST_1); m.visitMethodInsn(INVOKEVIRTUAL, C, "setAdjustRadarForGunTurn", "(Z)V", false);
        m.visitVarInsn(ALOAD, 0); m.visitLdcInsn(Double.POSITIVE_INFINITY); m.visitMethodInsn(INVOKEVIRTUAL, C, "turnRadarRightRadians", "(D)V", false);
        m.visitInsn(RETURN); m.visitMaxs(0, 0); m.visitEnd();
        // onHitWall
        m = cw.visitMethod(ACC_PUBLIC, "onHitWall", "(Lrobocode/HitWallEvent;)V", null, null);
        m.visitFieldInsn(GETSTATIC, C, "dir", "D"); m.visitInsn(DNEG); m.visitFieldInsn(PUTSTATIC, C, "dir", "D"); m.visitInsn(RETURN); m.visitMaxs(0, 0); m.visitEnd();
        // onScannedRobot: locals 0 this, 1 e, 2-3 d, 4-5 abs bearing, 6 k, 7 i, 8 n, 9-10 p
        m = cw.visitMethod(ACC_PUBLIC, "onScannedRobot", "(L" + SRE + ";)V", null, null);
        Label skip = new Label(), loop = new Label(), rl = new Label(), re = new Label();
        m.visitVarInsn(ALOAD, 0); m.visitVarInsn(ALOAD, 0); m.visitMethodInsn(INVOKEVIRTUAL, C, "getRadarTurnRemainingRadians", "()D", false);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "setTurnRadarLeftRadians", "(D)V", false);
        // reverse on an energy drop, if this bot is not on the orbit list, with chance 0.6
        m.visitFieldInsn(GETSTATIC, C, "E", "D"); m.visitVarInsn(ALOAD, 1); m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getEnergy", "()D", false);
        m.visitInsn(DUP2); m.visitFieldInsn(PUTSTATIC, C, "E", "D"); m.visitInsn(DCMPL); m.visitJumpInsn(IFLE, skip);
        if (scale > 0) {
            // chance by position: reverse when random * scale > list.indexOf(name) (absent: always)
            m.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "random", "()D", false); m.visitLdcInsn(scale); m.visitInsn(DMUL);
            m.visitLdcInsn(list); m.visitVarInsn(ALOAD, 1); m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getName", "()Ljava/lang/String;", false);
            m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false); m.visitInsn(I2D); m.visitInsn(DCMPL); m.visitJumpInsn(IFLE, skip);
        } else {
        m.visitLdcInsn(list); m.visitVarInsn(ALOAD, 1); m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getName", "()Ljava/lang/String;", false);
        m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false); m.visitJumpInsn(IFGE, skip);
        m.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "random", "()D", false); m.visitLdcInsn(chance); m.visitInsn(DCMPG); m.visitJumpInsn(IFGE, skip);
        }
        m.visitFieldInsn(GETSTATIC, C, "dir", "D"); m.visitInsn(DNEG); m.visitFieldInsn(PUTSTATIC, C, "dir", "D");
        m.visitLabel(skip);
        // orbit: turn by cos(bearing + dir*(300-d)/72000), ahead dir
        m.visitVarInsn(ALOAD, 0);
        m.visitVarInsn(ALOAD, 1); m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getBearingRadians", "()D", false);
        m.visitLdcInsn(ideal); m.visitVarInsn(ALOAD, 1); m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getDistance", "()D", false);
        m.visitInsn(DUP2); m.visitVarInsn(DSTORE, D); m.visitInsn(DSUB); m.visitFieldInsn(GETSTATIC, C, "dir", "D"); m.visitInsn(DDIV); m.visitInsn(DADD);
        m.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "cos", "(D)D", false); m.visitMethodInsn(INVOKEVIRTUAL, C, "setTurnRightRadians", "(D)V", false);
        m.visitVarInsn(ALOAD, 0); m.visitFieldInsn(GETSTATIC, C, "dir", "D"); m.visitMethodInsn(INVOKEVIRTUAL, C, "setAhead", "(D)V", false);
        // history: h = (char) lateral velocity + h
        m.visitVarInsn(ALOAD, 1); m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getVelocity", "()D", false);
        m.visitVarInsn(ALOAD, 1); m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getHeadingRadians", "()D", false);
        m.visitVarInsn(ALOAD, 1); m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getBearingRadians", "()D", false);
        m.visitVarInsn(ALOAD, 0); m.visitMethodInsn(INVOKEVIRTUAL, C, "getHeadingRadians", "()D", false); m.visitInsn(DADD);
        m.visitInsn(DUP2); m.visitVarInsn(DSTORE, A); m.visitInsn(DSUB);
        m.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "sin", "(D)D", false); m.visitInsn(DMUL);
        if (round) { m.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "round", "(D)J", false); m.visitInsn(L2I); } else m.visitInsn(D2I);
        m.visitInsn(I2C); m.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(C)Ljava/lang/String;", false);
        m.visitFieldInsn(GETSTATIC, C, "h", "Ljava/lang/String;"); m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        m.visitInsn(DUP); m.visitFieldInsn(PUTSTATIC, C, "h", "Ljava/lang/String;"); m.visitVarInsn(ASTORE, 1); // e is done with: slot 1 holds h
        // longest match: k = 30 down; i = h.indexOf(h.substring(0, k--), 1) until i >= 0
        m.visitIntInsn(BIPUSH, 30); m.visitVarInsn(ISTORE, K);
        m.visitLabel(loop);
        m.visitVarInsn(ALOAD, 1); m.visitInsn(DUP); m.visitInsn(ICONST_0); m.visitVarInsn(ILOAD, K); m.visitIincInsn(K, -1);
        m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false); m.visitInsn(ICONST_1);
        m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;I)I", false);
        m.visitInsn(DUP); m.visitVarInsn(ISTORE, I); m.visitJumpInsn(IFLT, loop);
        // power and flight ticks n = (int) (d / (20 - 3p))
        m.visitVarInsn(ALOAD, 0);
        if (power) {
            m.visitLdcInsn(200.0); m.visitVarInsn(DLOAD, D); m.visitInsn(DCMPG); m.visitInsn(ICONST_5); m.visitInsn(IADD); m.visitInsn(ICONST_2); m.visitInsn(IDIV); m.visitInsn(I2D);
            if (n14) { m.visitMethodInsn(INVOKEVIRTUAL, C, "setFire", "(D)V", false); m.visitVarInsn(DLOAD, D); m.visitLdcInsn(14.0); m.visitInsn(DDIV); } else {
            m.visitInsn(DUP2_X1); m.visitMethodInsn(INVOKEVIRTUAL, C, "setFire", "(D)V", false);
            m.visitLdcInsn(-3.0); m.visitInsn(DMUL); m.visitLdcInsn(20.0); m.visitInsn(DADD);
            m.visitVarInsn(DLOAD, D); m.visitInsn(DUP2_X2); m.visitInsn(POP2); m.visitInsn(DDIV); }
        } else {
            if (k > 0) { m.visitLdcInsn((double) k); m.visitVarInsn(DLOAD, D); m.visitInsn(DDIV); } else { m.visitInsn(ICONST_2); m.visitInsn(I2D); } m.visitMethodInsn(INVOKEVIRTUAL, C, "setFire", "(D)V", false);
            m.visitVarInsn(DLOAD, D); m.visitLdcInsn(14.0); m.visitInsn(DDIV);
        }
        m.visitInsn(D2I); m.visitVarInsn(ISTORE, N);
        // replay: o = sum of h[i-1 - n%i] over the flight, kept on the stack under this
        m.visitVarInsn(ALOAD, 0); m.visitInsn(DCONST_0);
        m.visitLabel(rl);
        m.visitIincInsn(N, -1);
        m.visitVarInsn(ALOAD, 1); m.visitVarInsn(ILOAD, I); m.visitInsn(ICONST_1); m.visitInsn(ISUB);
        m.visitVarInsn(ILOAD, N); m.visitVarInsn(ILOAD, I); m.visitInsn(IREM); m.visitInsn(ISUB);
        m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false); m.visitInsn(I2S); m.visitInsn(I2D); m.visitInsn(DADD);
        m.visitVarInsn(ILOAD, N); m.visitJumpInsn(IFGT, rl);
        m.visitVarInsn(DLOAD, D); m.visitInsn(DDIV); m.visitVarInsn(DLOAD, A); m.visitInsn(DADD);
        m.visitVarInsn(ALOAD, 0); m.visitMethodInsn(INVOKEVIRTUAL, C, "getGunHeadingRadians", "()D", false); m.visitInsn(DSUB);
        m.visitMethodInsn(INVOKESTATIC, "robocode/util/Utils", "normalRelativeAngle", "(D)D", false);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "setTurnGunRightRadians", "(D)V", false);
        m.visitInsn(RETURN); m.visitMaxs(0, 0); m.visitEnd();
        cw.visitEnd();
        Files.write(Paths.get(a[0]), cw.toByteArray());
    }
}
