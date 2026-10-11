# Building Hadur: lab code

The Maven projects behind the labs of the **Building Hadur** course in [`../course`](../course).
Each lab grows Hadurling, a small Robocode robot, one step at a time.

| Folder | Is |
|---|---|
| `lab-00` | the starting skeleton; Lab 01 starts here |
| `lab-NN` | the solution to Lab NN, and the starting point of Lab NN+1 |
| `tools/` | scripts for authors (see [AUTHORING.md](AUTHORING.md)) |

## Using a lab

You need JDK 17 or later and Maven 3.9. Hadurling's own code compiles for Java 11, like
Hadur, so every Robocode install can load it.

```sh
cd course-labs/lab-04
mvn verify
```

To fight with it, copy the robot jar from the lab's `target/` folder (or
`hadurling-robot/target/` from lab 04 on) into Robocode's `robots/` folder.

If you fall behind, start the next lab from the previous lab's folder, or download
`start.zip` from the lab page in the course.

## Building and publishing the course

The course is a [Tutors](https://tutors.dev) course. Tutors builds it with Deno:

```sh
cd course
deno run -A jsr:@tutors/tutors      # writes course/json, which the Tutors reader serves
```

To publish it, point a Netlify (or Vercel) site at this repository with **base directory**
`course`, **build command** `deno run -A jsr:@tutors/tutors` and **publish directory** `json`.
The course then opens at `https://tutors.dev/course/<netlify-site-name>`. GitHub Pages stays
with the Hadur docs site.

Authors: run `tools/check.sh` after changing a lab (it builds every lab and refreshes the
start zips), and `python3 tools/cards.py` after adding a learning object without an image.
