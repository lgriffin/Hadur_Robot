/**
 * The link (A4): teammates' reports as bytes, in the core's own versioned, checksummed
 * format (LINK-1). The core may not touch {@code java.io} (RES-6), so it cannot send a
 * serializable class: the adapter broadcasts the byte arrays {@link hadur2.core.link.LinkCodec}
 * writes and hands back the ones it receives. A message that fails its checksum, carries an
 * unknown version or does not parse is refused, never half read (LINK-2), the way a damaged
 * profile is. Kernel-owned: a sighting is a sighting whoever made it.
 */
package hadur2.core.link;
