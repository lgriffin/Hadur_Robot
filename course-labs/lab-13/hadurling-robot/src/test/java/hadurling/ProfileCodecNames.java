package hadurling;

import hadurling.core.memory.LineageKey;
import hadurling.core.memory.ProfileLibrary;

/** The file name the library gives a key: the stem plus the profile suffix. */
final class ProfileCodecNames {

    private ProfileCodecNames() {}

    static String file(String key) {
        return LineageKey.fileStem(key) + ProfileLibrary.SUFFIX;
    }
}
