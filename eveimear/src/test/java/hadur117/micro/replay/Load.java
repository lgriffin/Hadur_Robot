package hadur117.micro.replay;
import java.io.*;
import java.util.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;
/** Loads a robot's classes from a jar or class folder, swapping AdvancedRobot for Fake and Math.random for R.next, bytecode untouched otherwise. */
public class Load extends ClassLoader {
    final Map<String, byte[]> raw = new HashMap<>();
    public Load(String path) throws IOException {
        super(Load.class.getClassLoader());
        File f = new File(path);
        if (f.isDirectory()) walk(f, f); else try (ZipFile z = new ZipFile(f)) {
            for (Enumeration<? extends ZipEntry> e = z.entries(); e.hasMoreElements();) {
                ZipEntry x = e.nextElement();
                if (x.getName().endsWith(".class")) raw.put(x.getName().replace(".class", "").replace('/', '.'), z.getInputStream(x).readAllBytes());
            }
        }
    }
    void walk(File root, File d) throws IOException {
        for (File c : d.listFiles()) {
            if (c.isDirectory()) walk(root, c);
            else if (c.getName().endsWith(".class")) raw.put(root.toPath().relativize(c.toPath()).toString().replace(".class", "").replace(File.separatorChar, '.'), java.nio.file.Files.readAllBytes(c.toPath()));
        }
    }
    @Override protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = raw.get(name);
        if (b == null) throw new ClassNotFoundException(name);
        ClassReader r = new ClassReader(b);
        ClassWriter w = new ClassWriter(0);
        Remapper m = new Remapper() { @Override public String map(String n) { return n.equals("robocode/AdvancedRobot") ? "hadur117/micro/replay/Fake" : n; } };
        r.accept(new ClassRemapper(new ClassVisitor(Opcodes.ASM9, w) {
            @Override public MethodVisitor visitMethod(int a, String n, String d, String s, String[] e) {
                return new MethodVisitor(Opcodes.ASM9, super.visitMethod(a, n, d, s, e)) {
                    @Override public void visitMethodInsn(int op, String o, String mn, String md, boolean itf) {
                        if (o.equals("java/lang/Math") && mn.equals("random")) super.visitMethodInsn(op, "hadur117/micro/replay/R", "next", md, false);
                        else super.visitMethodInsn(op, o, mn, md, itf);
                    }
                };
            }
        }, m), 0);
        byte[] out = w.toByteArray();
        return defineClass(name, out, 0, out.length);
    }
    @Override protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        if (raw.containsKey(name)) { synchronized (getClassLoadingLock(name)) { Class<?> c = findLoadedClass(name); if (c == null) c = findClass(name); return c; } }
        return super.loadClass(name, resolve);
    }
}
