# Instructions

1. Install [Leiningen](https://github.com/technomancy/leiningen#leiningen).
   It’s a Clojure projects manager and will be your companion during your
   Clojure development.
2. Read the problems. The code and the problems are both in `src/p99/core.clj`.
   Each problem (except the first few ones) has the following skeleton:

        ;; problem <number> (<difficulty>)
        (defn problem-name-solution
        [& args] ;; update args as needed
        ;; The problem instructions are written here, and can span multiple
        ;; lines.
        nil)

   This means that, by default, each problem is a function which takes any
   number of arguments and return `nil`. You’ll have to fill the blanks and
   edit the code to solve each problem. You can format the code as you want,
   but don’t rename the solutions to not break the tests suit. Note that some
   solutions shouldn’t even be functions.
3. A test suite is included in `test/p99/core_test.clj`. Read it when you’re
   writing a solution to check what’s the expected use of the solution (e.g.
   which are its arguments, which return value is expected).
   All tests are commented except the first one. Each problem has a test,
   uncomment it when you’re writing the solution to ensure its correctness.  
   You can run the tests suit with `lein test`.

## Sources

All these problems are imported from [4clojure](http://www.4clojure.com/) using
a [leiningen plugin](https://github.com/bfontaine/lein-fore-prob). 4clojure has
more than 99 problems, and you can solve them online, on their website.
