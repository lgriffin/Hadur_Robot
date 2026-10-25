package hadur117.micro.harness;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import robocode.robotinterfaces.peer.IAdvancedRobotPeer;

/**
 * An engine peer for a robot under test: getters answer from {@link #values}, every other call
 * is an order and is logged as {@code name(arg, ...)} with doubles at full precision, so two
 * logs are equal only when every order is equal to the bit.
 */
public final class FakePeer implements InvocationHandler {

    /** Getter name to the value it returns; unset getters return 0, false or null. */
    public final Map<String, Object> values = new HashMap<>();
    /** The orders, in the order the robot gave them. */
    public final List<String> orders = new ArrayList<>();
    /** The orders given since {@link #now} was last cleared, by name, with their first argument. */
    public final Map<String, Object> now = new HashMap<>();

    /**
     * A peer backed by a new handler.
     *
     * @param handler the handler
     * @return the peer to give the robot
     */
    public static IAdvancedRobotPeer peer(FakePeer handler) {
        return (IAdvancedRobotPeer) Proxy.newProxyInstance(FakePeer.class.getClassLoader(),
            new Class<?>[] {IAdvancedRobotPeer.class}, handler);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        String name = method.getName();
        Class<?> type = method.getReturnType();
        if ((name.startsWith("get") || name.startsWith("is")) && (args == null || args.length == 0)) {
            Object v = values.get(name);
            return v != null ? v : zero(type);
        }
        StringBuilder b = new StringBuilder(name).append('(');
        for (int i = 0; args != null && i < args.length; i++) {
            if (i > 0) b.append(", ");
            b.append(args[i]);
        }
        orders.add(b.append(')').toString());
        now.put(name, args == null || args.length == 0 ? null : args[0]);
        if (name.equals("toString")) return "FakePeer";
        if (name.equals("hashCode")) return System.identityHashCode(this);
        if (name.equals("equals")) return proxy == args[0];
        return zero(type);
    }

    private static Object zero(Class<?> type) {
        if (type == double.class) return 0.0;
        if (type == int.class) return 0;
        if (type == long.class) return 0L;
        if (type == boolean.class) return false;
        return null;
    }
}
