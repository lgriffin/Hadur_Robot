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

## Next entry: 3.5

Hadur 3.5 (R9, the weak-bot leak, see
[docs/releases/v3.5.md](https://github.com/lgriffin/Hadur_Robot/blob/master/docs/releases/v3.5.md))
replaces 3.4 in both leagues. The repository is public, so the GitHub release's asset is a
direct download that never expires:

```
hadur2.Hadur 3.5,https://github.com/lgriffin/Hadur_Robot/releases/download/v3.5/hadur2.Hadur_3.5.jar
```

Save 3.4's BotDetails page before swapping, so 3.5's weak-tier PBI can be compared with
3.4's −1.7.

## Country flag

LiteRumble shows the flag of the author's country next to each bot, keyed by the bot's
main package, from the robowiki page
[RoboRumble/Country Flags](https://robowiki.net/wiki/RoboRumble/Country_Flags). Hadur's
package is `hadur2`, so the page needs one line `hadur2,IRL` (package, comma, the
three-letter code the other entries use), added once; every Hadur version picks it up.

## Previous entry: 3.4

Hadur 3.4 (R8's memory fixes, see
[docs/releases/v3.4.md](https://github.com/lgriffin/Hadur_Robot/blob/master/docs/releases/v3.4.md))
replaced 3.3 with
`hadur2.Hadur 3.4,https://github.com/lgriffin/Hadur_Robot/releases/download/v3.4/hadur2.Hadur_3.4.jar`
and reached 20th in the 1v1 RoboRumble; 3.5 supersedes it.

## Previous entry: 3.3

Hadur 3.3 (R5, R7 and R6 of the top-30 climb in one version, see
[docs/releases/v3.3.md](https://github.com/lgriffin/Hadur_Robot/blob/master/docs/releases/v3.3.md))
was to replace 3.2 with `hadur2.Hadur 3.3,<Leigh's Google Drive link>`; 3.4 supersedes it.

## Previous entry: 3.2

Hadur 3.2 (R4 of the RoboRumble climb plan: the client-conditions bench, live-details
reader, fallback fire and health record, see
[docs/releases/v3.2.md](https://github.com/lgriffin/Hadur_Robot/blob/master/docs/releases/v3.2.md))
replaces 3.1 in both leagues. This line replaces the 3.1 line on both participants pages
once Leigh hosts the jar on Google Drive:

```
hadur2.Hadur 3.2,<Leigh's Google Drive link>
```

**Wait before swapping.** 3.1 went live at 04:32 UTC 2026-09-29; R4's read on whether R1
already fixed the 08:30 UTC collapse needs 3.1's own BotDetails page with 300+ pairings
(about 6 hours, so from roughly 10:30 UTC). Save that page first, or the signal is lost.

To do: Leigh saves 3.1's BotDetails page (once it has 300+ pairings), uploads the 3.2 jar
(step 2 below), replaces the 3.1 line with the real link on both participants pages, and
saves a BotDetails page for 3.2 once it has 300+ pairings too (BENCH-5 reads both).

## Previous entry: 3.1

Hadur 3.1 (R1 to R3 of the RoboRumble climb plan) replaced 3.0 in both leagues on
2026-09-29 with this line:

```
hadur2.Hadur 3.1,https://drive.google.com/uc?export=download&id=1KLr000bCbXMk255jkojnkDOaezNr50Hj
```

## Earlier entry: 3.0

Hadur 3.0 (the melee extension, M0 to M6) replaced 2.2 in both leagues on 2026-09-28 with
this line:

```
hadur2.Hadur 3.0,https://drive.google.com/uc?export=download&id=1Pv1Czl_DGdxiGxkD4cdd4ze4clhOu2HY
```

Its GitHub release is [v3.0](https://github.com/lgriffin/Hadur_Robot/releases/tag/v3.0).
SHA-256 `d12cc9367eca841498e851c07bd41629bfc4e564300e4c9207cceeaafa75f63d`.

## 1. Get the jar

Build it with `mvn -B verify` (it lands in `hadur-robot/target/`), or, once a `v*` tag has
run the release workflow, download it from that GitHub release (signed in to GitHub). Keep
the file name exactly as it is: rumble clients expect `<package>.<Robot>_<version>.jar`.

## 2. Host it on Google Drive with a direct link

1. Upload the jar (`hadur2.Hadur_3.4.jar`) to Google Drive.
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

Since the repository went public (2026-09-28), a release's
`https://github.com/lgriffin/Hadur_Robot/releases/download/v<version>/hadur2.Hadur_<version>.jar`
is itself a direct download that never expires, so Drive is optional.

## 3. Add the entry on the robowiki

1. Log in to [robowiki.net](https://robowiki.net) (create an account if you don't have one).
2. Open [RoboRumble/Participants](https://robowiki.net/wiki/RoboRumble/Participants) (1v1)
   and click **Edit**. Repeat steps 2 to 4 on
   [RoboRumble/Participants/Melee](https://robowiki.net/wiki/RoboRumble/Participants/Melee).
3. Inside the `<pre>` block, add this line in alphabetical order by name (entries starting
   with `h` sit together), using your Drive link from step 2:

   ```
   hadur2.Hadur 3.4,https://drive.google.com/uc?export=download&id=1AbCdEfGhIjKlMnOpQrStUvWxYz
   ```

   The part before the comma must match the jar's `robot.classname` and `robot.version`
   exactly: `hadur2.Hadur` and `3.4`, separated by one space.
4. Put something like "Hadur 3.4 replaces 3.3" in the edit summary and save.

Clients pick up the participants list on their next run. Battles, and then a ranking, show
up on the [RoboRumble](https://literumble.appspot.com/Rankings?game=roborumble) and
[MeleeRumble](https://literumble.appspot.com/Rankings?game=meleerumble) rankings
over the following days; it takes a few thousand battles for the rating to settle.

## Later versions

Give every new jar a new version (`3.2`, ...), upload it, and replace the old line on the
participants page with the new one. Two versions of the same robot should not be entered
at once unless you mean to compare them.
