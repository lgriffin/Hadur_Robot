package hadur117.nano.gen;

import static org.objectweb.asm.Opcodes.*;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/**
 * Writes the shipped hadur117.nano.Sanara class as bytecode (docs/sanara.md, "The fit"), over the
 * class javac made from Sanara.java. javac cannot get this play under about 300 bytes; written by
 * hand it is 249. The play is Sanara.java's, line for line, with these encodings:
 * <ul>
 * <li>{@code dir} is the leg length, +-600, so the orbit tilt is {@code (300 - d) / dir};</li>
 * <li>the history is kept in the event's local slot once the event has been read;</li>
 * <li>the replay is a do-while summing {@code h[i - 1 - n % i]}, the wrapping replay's sum;</li>
 * <li>class version 49, so the verifier needs no stack map frames.</li>
 * </ul>
 * Args: OUT.class ORBIT-LIST.txt
 */
public final class SanaraGen {
    static final String C = "hadur117/nano/Sanara", SRE = "robocode/ScannedRobotEvent", AR = "robocode/AdvancedRobot";
    static final String S = "Ljava/lang/String;";
    // Local slots in onScannedRobot: 1 the event, then the history; 2 the match; 3 the key length,
    // then the flight ticks; 4-5 the distance; 6-7 the absolute bearing.
    static final int I = 2, N = 3, K = 3, D = 4, A = 6;

    public static void main(String[] args) throws Exception {
        List<String> names = new ArrayList<String>();
        for (String s : Files.readAllLines(Paths.get(args[1]), StandardCharsets.UTF_8)) {
            if (!s.startsWith("#") && !s.trim().isEmpty()) {
                names.add(s.trim());
            }
        }
        StringBuilder list = new StringBuilder();
        for (String s : names) {
            list.append(list.length() == 0 ? "" : "|").append(s);
        }
        StringBuilder zeros = new StringBuilder();
        for (int i = 0; i < 40; i++) {
            zeros.append('\0');
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(V1_5, ACC_PUBLIC | ACC_SUPER, C, null, AR, null);
        cw.visitSource("Sanara.java", null);
        cw.visitField(ACC_STATIC, "h", S, null, null);
        cw.visitField(ACC_STATIC, "E", "D", null, null);
        cw.visitField(ACC_STATIC, "dir", "D", null, null);
        MethodVisitor m;

        m = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        m.visitVarInsn(ALOAD, 0);
        m.visitMethodInsn(INVOKESPECIAL, AR, "<init>", "()V", false);
        m.visitInsn(RETURN);
        m.visitMaxs(0, 0);
        m.visitEnd();

        m = cw.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
        m.visitLdcInsn(zeros.toString());
        m.visitFieldInsn(PUTSTATIC, C, "h", S);
        m.visitLdcInsn(600.0);
        m.visitFieldInsn(PUTSTATIC, C, "dir", "D");
        m.visitInsn(RETURN);
        m.visitMaxs(0, 0);
        m.visitEnd();

        m = cw.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
        m.visitVarInsn(ALOAD, 0);
        m.visitInsn(ICONST_1);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "setAdjustRadarForGunTurn", "(Z)V", false);
        m.visitVarInsn(ALOAD, 0);
        m.visitLdcInsn(Double.POSITIVE_INFINITY);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "turnRadarRightRadians", "(D)V", false);
        m.visitInsn(RETURN);
        m.visitMaxs(0, 0);
        m.visitEnd();

        m = cw.visitMethod(ACC_PUBLIC, "onHitWall", "(Lrobocode/HitWallEvent;)V", null, null);
        m.visitFieldInsn(GETSTATIC, C, "dir", "D");
        m.visitInsn(DNEG);
        m.visitFieldInsn(PUTSTATIC, C, "dir", "D");
        m.visitInsn(RETURN);
        m.visitMaxs(0, 0);
        m.visitEnd();

        m = cw.visitMethod(ACC_PUBLIC, "onScannedRobot", "(L" + SRE + ";)V", null, null);
        Label skip = new Label(), search = new Label(), replay = new Label();
        // Radar lock.
        m.visitVarInsn(ALOAD, 0);
        m.visitVarInsn(ALOAD, 0);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "getRadarTurnRemainingRadians", "()D", false);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "setTurnRadarLeftRadians", "(D)V", false);
        // On an energy drop, unless the robot is on the orbit list, reverse with chance 0.6.
        m.visitFieldInsn(GETSTATIC, C, "E", "D");
        m.visitVarInsn(ALOAD, 1);
        m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getEnergy", "()D", false);
        m.visitInsn(DUP2);
        m.visitFieldInsn(PUTSTATIC, C, "E", "D");
        m.visitInsn(DCMPL);
        m.visitJumpInsn(IFLE, skip);
        m.visitLdcInsn(list.toString());
        m.visitVarInsn(ALOAD, 1);
        m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getName", "()" + S, false);
        m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(" + S + ")I", false);
        m.visitJumpInsn(IFGE, skip);
        m.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "random", "()D", false);
        m.visitLdcInsn(0.6);
        m.visitInsn(DCMPG);
        m.visitJumpInsn(IFGE, skip);
        m.visitFieldInsn(GETSTATIC, C, "dir", "D");
        m.visitInsn(DNEG);
        m.visitFieldInsn(PUTSTATIC, C, "dir", "D");
        m.visitLabel(skip);
        // Orbit: turn by cos(bearing + (300 - d) / dir), ahead dir.
        m.visitVarInsn(ALOAD, 0);
        m.visitVarInsn(ALOAD, 1);
        m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getBearingRadians", "()D", false);
        m.visitLdcInsn(300.0);
        m.visitVarInsn(ALOAD, 1);
        m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getDistance", "()D", false);
        m.visitInsn(DUP2);
        m.visitVarInsn(DSTORE, D);
        m.visitInsn(DSUB);
        m.visitFieldInsn(GETSTATIC, C, "dir", "D");
        m.visitInsn(DDIV);
        m.visitInsn(DADD);
        m.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "cos", "(D)D", false);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "setTurnRightRadians", "(D)V", false);
        m.visitVarInsn(ALOAD, 0);
        m.visitFieldInsn(GETSTATIC, C, "dir", "D");
        m.visitMethodInsn(INVOKEVIRTUAL, C, "setAhead", "(D)V", false);
        // History: h = (char) round(lateral velocity) + h, then kept in slot 1.
        m.visitVarInsn(ALOAD, 1);
        m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getVelocity", "()D", false);
        m.visitVarInsn(ALOAD, 1);
        m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getHeadingRadians", "()D", false);
        m.visitVarInsn(ALOAD, 1);
        m.visitMethodInsn(INVOKEVIRTUAL, SRE, "getBearingRadians", "()D", false);
        m.visitVarInsn(ALOAD, 0);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "getHeadingRadians", "()D", false);
        m.visitInsn(DADD);
        m.visitInsn(DUP2);
        m.visitVarInsn(DSTORE, A);
        m.visitInsn(DSUB);
        m.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "sin", "(D)D", false);
        m.visitInsn(DMUL);
        m.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "round", "(D)J", false);
        m.visitInsn(L2I);
        m.visitInsn(I2C);
        m.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(C)" + S, false);
        m.visitFieldInsn(GETSTATIC, C, "h", S);
        m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "concat", "(" + S + ")" + S, false);
        m.visitInsn(DUP);
        m.visitFieldInsn(PUTSTATIC, C, "h", S);
        m.visitVarInsn(ASTORE, 1);
        // Longest match: k from 30 down, i = h.indexOf(h.substring(0, k--), 1) until i >= 0.
        m.visitIntInsn(BIPUSH, 30);
        m.visitVarInsn(ISTORE, K);
        m.visitLabel(search);
        m.visitVarInsn(ALOAD, 1);
        m.visitInsn(DUP);
        m.visitInsn(ICONST_0);
        m.visitVarInsn(ILOAD, K);
        m.visitIincInsn(K, -1);
        m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)" + S, false);
        m.visitInsn(ICONST_1);
        m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(" + S + "I)I", false);
        m.visitInsn(DUP);
        m.visitVarInsn(ISTORE, I);
        m.visitJumpInsn(IFLT, search);
        // Fire 800 / d (the engine caps it at 3); flight ticks n = (int) (d / 14).
        m.visitVarInsn(ALOAD, 0);
        m.visitLdcInsn(800.0);
        m.visitVarInsn(DLOAD, D);
        m.visitInsn(DDIV);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "setFire", "(D)V", false);
        m.visitVarInsn(DLOAD, D);
        m.visitLdcInsn(14.0);
        m.visitInsn(DDIV);
        m.visitInsn(D2I);
        m.visitVarInsn(ISTORE, N);
        // Replay: the sum of h[i - 1 - n % i] for n from flight ticks - 1 down to 0, kept on the stack.
        m.visitVarInsn(ALOAD, 0);
        m.visitInsn(DCONST_0);
        m.visitLabel(replay);
        m.visitIincInsn(N, -1);
        m.visitVarInsn(ALOAD, 1);
        m.visitVarInsn(ILOAD, I);
        m.visitInsn(ICONST_1);
        m.visitInsn(ISUB);
        m.visitVarInsn(ILOAD, N);
        m.visitVarInsn(ILOAD, I);
        m.visitInsn(IREM);
        m.visitInsn(ISUB);
        m.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
        m.visitInsn(I2S);
        m.visitInsn(I2D);
        m.visitInsn(DADD);
        m.visitVarInsn(ILOAD, N);
        m.visitJumpInsn(IFGT, replay);
        // Aim: the bearing plus the replayed lateral travel over the distance.
        m.visitVarInsn(DLOAD, D);
        m.visitInsn(DDIV);
        m.visitVarInsn(DLOAD, A);
        m.visitInsn(DADD);
        m.visitVarInsn(ALOAD, 0);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "getGunHeadingRadians", "()D", false);
        m.visitInsn(DSUB);
        m.visitMethodInsn(INVOKESTATIC, "robocode/util/Utils", "normalRelativeAngle", "(D)D", false);
        m.visitMethodInsn(INVOKEVIRTUAL, C, "setTurnGunRightRadians", "(D)V", false);
        m.visitInsn(RETURN);
        m.visitMaxs(0, 0);
        m.visitEnd();
        cw.visitEnd();

        OutputStream out = new FileOutputStream(args[0]);
        try {
            out.write(cw.toByteArray());
        } finally {
            out.close();
        }
    }
}
