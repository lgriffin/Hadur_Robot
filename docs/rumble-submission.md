# Entering Hadur in the RoboRumble and MeleeRumble

Hadur 3.0 is built for both leagues. The RoboRumble is the 1v1 league (800x600, 35 rounds),
where the duelist of S0 to S6 fights; the MeleeRumble is the 10-robot free-for-all
(1000x1000, 35 rounds), where the melee brain takes over until one opponent is left.
Volunteers' clients download every entrant's jar, run the battles, and the results go to
the public rankings. An entry is one line on a robowiki participants page: the robot's
name and version, a comma, and a URL that downloads the jar directly. The same jar and the
same line go on both pages:
[RoboRumble/Participants](https://robowiki.net/wiki/RoboRumble/Participants) for 1v1 and
[RoboRumble/Participants/Melee](https://robowiki.net/wiki/RoboRumble/Participants/Melee).

## Current entry: 3.1

Hadur 3.1 (R1 to R3 of the RoboRumble climb plan, see
[docs/releases/v3.1.md](https://github.com/lgriffin/Hadur_Robot/blob/master/docs/releases/v3.1.md))
replaces 3.0 in both leagues. This line replaces the 3.0 line on both participants pages:

```
hadur2.Hadur 3.1,https://drive.google.com/uc?export=download&id=REPLACE_ME
```

To do: Leigh uploads `hadur2.Hadur_3.1.jar` to Google Drive (step 2 below), replaces the
3.0 line with the line above (using the real Drive id) on both participants pages, and
saves a BotDetails page for 3.1 into the project once it has 300+ pairings (R4 reads it).

## Previous entry: 3.0

Hadur 3.0 (the melee extension, M0 to M6) replaced 2.2 in both leagues on 2026-09-28 with
this line:

```
hadur2.Hadur 3.0,https://drive.google.com/uc?export=download&id=1Pv1Czl_DGdxiGxkD4cdd4ze4clhOu2HY
```

Its GitHub release is [v3.0](https://github.com/lgriffin/Hadur_Robot/releases/tag/v3.0).
SHA-256 `d12cc9367eca841498e851c07bd41629bfc4e564300e4c9207cceeaafa75f63d`.

## Earlier entry: 2.2

Hadur 2.2 was entered in both leagues on 2026-09-27 with this line:

```
hadur2.Hadur 2.2,https://drive.google.com/uc?export=download&id=1Ws7gHc5ZTAuzsWHt969rPavhWBEjJ3zV
```

That jar is a local build of master at 60b18fe (the S7 merge), SHA-256
`d9502bf441d9999ac282f0c9cd2f59b3aa738aea3d51155b8d5f94a1f1a9504a`.

## 1. Get the jar

Build it with `mvn -B verify` (it lands in `hadur-robot/target/`), or, once a `v*` tag has
run the release workflow, download it from that GitHub release (signed in to GitHub). Keep
the file name exactly as it is: rumble clients expect `<package>.<Robot>_<version>.jar`.

## 2. Host it on Google Drive with a direct link

1. Upload the jar (`hadur2.Hadur_3.1.jar`) to Google Drive.
2. Right-click it, **Share**, and under **General access** choose **Anyone with the link**
   (Viewer). Copy the link. It looks like
   `https://drive.google.com/file/d/1AbCdEfGhIjKlMnOpQrStUvWxYz/view?usp=sharing`.
3. Take the id between `/d/` and `/view` and put it in this form:

   ```
   https://drive.google.com/uc?export=download&id=1AbCdEfGhIjKlMnOpQrStUvWxYz
   ```

4. Check it: open that URL in a private browser window. The jar should download straight
   away, with no Drive preview page. (Files this small never get Drive's virus-scan
   warning page, which would break the download for rumble clients.)

The repository is private, so a GitHub release's download link only works for you, not
for rumble clients: use the Drive link. (If the repository is ever made public and a
release is published, `https://github.com/lgriffin/Hadur_Robot/releases/download/v<version>/hadur2.Hadur_<version>.jar`
becomes a direct download that never expires.)

## 3. Add the entry on the robowiki

1. Log in to [robowiki.net](https://robowiki.net) (create an account if you don't have one).
2. Open [RoboRumble/Participants](https://robowiki.net/wiki/RoboRumble/Participants) (1v1)
   and click **Edit**. Repeat steps 2 to 4 on
   [RoboRumble/Participants/Melee](https://robowiki.net/wiki/RoboRumble/Participants/Melee).
3. Inside the `<pre>` block, add this line in alphabetical order by name (entries starting
   with `h` sit together), using your Drive link from step 2:

   ```
   hadur2.Hadur 3.0,https://drive.google.com/uc?export=download&id=1AbCdEfGhIjKlMnOpQrStUvWxYz
   ```

   The part before the comma must match the jar's `robot.classname` and `robot.version`
   exactly: `hadur2.Hadur` and `3.0`, separated by one space.
4. Put something like "Hadur 3.0 replaces 2.2" in the edit summary and save.

Clients pick up the participants list on their next run. Battles, and then a ranking, show
up on the [RoboRumble](https://literumble.appspot.com/Rankings?game=roborumble) and
[MeleeRumble](https://literumble.appspot.com/Rankings?game=meleerumble) rankings
over the following days; it takes a few thousand battles for the rating to settle.

## Later versions

Give every new jar a new version (`3.1`, ...), upload it, and replace the old line on the
participants page with the new one. Two versions of the same robot should not be entered
at once unless you mean to compare them.
