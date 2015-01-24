(ns p99.core)

;; problem 1 (Elementary)
(defn nothing-but-the-truth-solution
  [& args] ;; update args as needed
  ;; This is a clojure form. Enter a value which will make the form evaluate to
  ;; true. Don't over think it! If you are confused, see the getting started
  ;; page. Hint: true is equal to true.
  nil)


;; problem 2 (Elementary)
(defn simple-math-solution
  [& args] ;; update args as needed
  ;; If you are not familiar with polish notation, simple arithmetic might seem
  ;; confusing. Note: Enter only enough to fill in the blank (in this case, a
  ;; single number) - do not retype the whole problem.
  nil)


;; problem 3 (Elementary)
(defn intro-to-strings-solution
  [& args] ;; update args as needed
  ;; Clojure strings are Java strings. This means that you can use any of the
  ;; Java string methods on Clojure strings.
  nil)


;; problem 4 (Elementary)
(defn intro-to-lists-solution
  [& args] ;; update args as needed
  ;; Lists can be constructed with either a function or a quoted form.
  nil)


;; problem 5 (Elementary)
(defn lists-conj-solution
  [& args] ;; update args as needed
  ;; When operating on a list, the conj function will return a new list with
  ;; one or more items "added" to the front.
  nil)


;; problem 6 (Elementary)
(defn intro-to-vectors-solution
  [& args] ;; update args as needed
  ;; Vectors can be constructed several ways. You can compare them with lists.
  nil)


;; problem 7 (Elementary)
(defn vectors-conj-solution
  [& args] ;; update args as needed
  ;; When operating on a Vector, the conj function will return a new vector
  ;; with one or more items "added" to the end.
  nil)


;; problem 8 (Elementary)
(defn intro-to-sets-solution
  [& args] ;; update args as needed
  ;; Sets are collections of unique values.
  nil)


;; problem 9 (Elementary)
(defn sets-conj-solution
  [& args] ;; update args as needed
  ;; When operating on a set, the conj function returns a new set with one or
  ;; more keys "added".
  nil)


;; problem 10 (Elementary)
(defn intro-to-maps-solution
  [& args] ;; update args as needed
  ;; Maps store key-value pairs. Both maps and keywords can be used as lookup
  ;; functions. Commas can be used to make maps more readable, but they are not
  ;; required.
  nil)


;; problem 11 (Elementary)
(defn maps-conj-solution
  [& args] ;; update args as needed
  ;; When operating on a map, the conj function returns a new map with one or
  ;; more key-value pairs "added".
  nil)


;; problem 12 (Elementary)
(defn intro-to-sequences-solution
  [& args] ;; update args as needed
  ;; All Clojure collections support sequencing. You can operate on sequences
  ;; with functions like first, second, and last.
  nil)


;; problem 13 (Elementary)
(defn sequences-rest-solution
  [& args] ;; update args as needed
  ;; The rest function will return all the items of a sequence except the
  ;; first.
  nil)


;; problem 14 (Elementary)
(defn intro-to-functions-solution
  [& args] ;; update args as needed
  ;; Clojure has many different ways to create functions.
  nil)


;; problem 15 (Elementary)
(defn double-down-solution
  [& args] ;; update args as needed
  ;; Write a function which doubles a number.
  nil)


;; problem 16 (Elementary)
(defn hello-world-solution
  [& args] ;; update args as needed
  ;; Write a function which returns a personalized greeting.
  nil)


;; problem 17 (Elementary)
(defn sequences-map-solution
  [& args] ;; update args as needed
  ;; The map function takes two arguments: a function (f) and a sequence (s).
  ;; Map returns a new sequence consisting of the result of applying f to each
  ;; item of s. Do not confuse the map function with the map data structure.
  nil)


;; problem 18 (Elementary)
(defn sequences-filter-solution
  [& args] ;; update args as needed
  ;; The filter function takes two arguments: a predicate function (f) and a
  ;; sequence (s). Filter returns a new sequence consisting of all the items of
  ;; s for which (f item) returns true.
  nil)


;; problem 19 (Easy)
;; restrictions: last
(defn last-element-solution
  [& args] ;; update args as needed
  ;; Write a function which returns the last element in a sequence.
  nil)


;; problem 20 (Easy)
(defn penultimate-element-solution
  [& args] ;; update args as needed
  ;; Write a function which returns the second to last element from a sequence.
  nil)


;; problem 21 (Easy)
;; restrictions: nth
(defn nth-element-solution
  [& args] ;; update args as needed
  ;; Write a function which returns the Nth element from a sequence.
  nil)


;; problem 22 (Easy)
;; restrictions: count
(defn count-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which returns the total number of elements in a sequence.
  nil)


;; problem 23 (Easy)
;; restrictions: reverse, rseq
(defn reverse-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which reverses a sequence.
  nil)


;; problem 24 (Easy)
(defn sum-it-all-up-solution
  [& args] ;; update args as needed
  ;; Write a function which returns the sum of a sequence of numbers.
  nil)


;; problem 25 (Easy)
(defn find-the-odd-numbers-solution
  [& args] ;; update args as needed
  ;; Write a function which returns only the odd numbers from a sequence.
  nil)


;; problem 26 (Easy)
(defn fibonacci-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which returns the first X fibonacci numbers.
  nil)


;; problem 27 (Easy)
(defn palindrome-detector-solution
  [& args] ;; update args as needed
  ;; Write a function which returns true if the given sequence is a palindrome.
  ;;
  ;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
  nil)


;; problem 28 (Easy)
;; restrictions: flatten
(defn flatten-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which flattens a sequence.
  nil)


;; problem 29 (Easy)
(defn get-the-caps-solution
  [& args] ;; update args as needed
  ;; Write a function which takes a string and returns a new string containing
  ;; only the capital letters.
  nil)


;; problem 30 (Easy)
(defn compress-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which removes consecutive duplicates from a sequence.
  nil)


;; problem 31 (Easy)
(defn pack-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which packs consecutive duplicates into sub-lists.
  nil)


;; problem 32 (Easy)
(defn duplicate-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which duplicates each element of a sequence.
  nil)


;; problem 33 (Easy)
(defn replicate-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which replicates each element of a sequence a variable
  ;; number of times.
  nil)


;; problem 34 (Easy)
;; restrictions: range
(defn implement-range-solution
  [& args] ;; update args as needed
  ;; Write a function which creates a list of all integers in a given range.
  nil)


;; problem 35 (Elementary)
(defn local-bindings-solution
  [& args] ;; update args as needed
  ;; Clojure lets you give local names to values using the special let-form.
  nil)


;; problem 36 (Elementary)
(defn let-it-be-solution
  [& args] ;; update args as needed
  ;; Can you bind x, y, and z so that these are all true?
  nil)


;; problem 37 (Elementary)
(defn regular-expressions-solution
  [& args] ;; update args as needed
  ;; Regex patterns are supported with a special reader macro.
  nil)


;; problem 38 (Easy)
;; restrictions: max, max-key
(defn maximum-value-solution
  [& args] ;; update args as needed
  ;; Write a function which takes a variable number of parameters and returns
  ;; the maximum value.
  nil)


;; problem 39 (Easy)
;; restrictions: interleave
(defn interleave-two-seqs-solution
  [& args] ;; update args as needed
  ;; Write a function which takes two sequences and returns the first item from
  ;; each, then the second item from each, then the third, etc.
  nil)


;; problem 40 (Easy)
;; restrictions: interpose
(defn interpose-a-seq-solution
  [& args] ;; update args as needed
  ;; Write a function which separates the items of a sequence by an arbitrary
  ;; value.
  nil)


;; problem 41 (Easy)
(defn drop-every-nth-item-solution
  [& args] ;; update args as needed
  ;; Write a function which drops every Nth item from a sequence.
  nil)


;; problem 42 (Easy)
(defn factorial-fun-solution
  [& args] ;; update args as needed
  ;; Write a function which calculates factorials.
  nil)


;; problem 43 (Medium)
(defn reverse-interleave-solution
  [& args] ;; update args as needed
  ;; Write a function which reverses the interleave process into x number of
  ;; subsequences.
  nil)


;; problem 44 (Medium)
(defn rotate-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which can rotate a sequence in either direction.
  nil)


;; problem 45 (Easy)
(defn intro-to-iterate-solution
  [& args] ;; update args as needed
  ;; The iterate function can be used to produce an infinite lazy sequence.
  nil)


;; problem 46 (Medium)
(defn flipping-out-solution
  [& args] ;; update args as needed
  ;; Write a higher-order function which flips the order of the arguments of an
  ;; input function.
  nil)


;; problem 47 (Easy)
(defn contain-yourself-solution
  [& args] ;; update args as needed
  ;; The contains? function checks if a KEY is present in a given collection.
  ;; This often leads beginner clojurians to use it incorrectly with
  ;; numerically indexed collections like vectors and lists.
  nil)


;; problem 48 (Easy)
(defn intro-to-some-solution
  [& args] ;; update args as needed
  ;; The some function takes a predicate function and a collection. It returns
  ;; the first logical true value of (predicate x) where x is an item in the
  ;; collection.
  nil)


;; problem 49 (Easy)
;; restrictions: split-at
(defn split-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which will split a sequence into two parts.
  nil)


;; problem 50 (Medium)
(defn split-by-type-solution
  [& args] ;; update args as needed
  ;; Write a function which takes a sequence consisting of items with different
  ;; types and splits them up into a set of homogeneous sub-sequences. The
  ;; internal order of each sub-sequence should be maintained, but the
  ;; sub-sequences themselves can be returned in any order (this is why 'set'
  ;; is used in the test cases).
  nil)


;; problem 51 (Easy)
(defn advanced-destructuring-solution
  [& args] ;; update args as needed
  ;; Here is an example of some more sophisticated destructuring.
  nil)


;; problem 52 (Easy)
(defn intro-to-destructuring-solution
  [& args] ;; update args as needed
  ;; Let bindings and function parameter lists support destructuring.
  nil)


;; problem 53 (Hard)
(defn longest-increasing-sub-seq-solution
  [& args] ;; update args as needed
  ;; Given a vector of integers, find the longest consecutive sub-sequence of
  ;; increasing numbers. If two sub-sequences have the same length, use the one
  ;; that occurs first. An increasing sub-sequence must have a length of 2 or
  ;; greater to qualify.
  nil)


;; problem 54 (Medium)
;; restrictions: partition, partition-all
(defn partition-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which returns a sequence of lists of x items each. Lists
  ;; of less than x items should not be returned.
  nil)


;; problem 55 (Medium)
;; restrictions: frequencies
(defn count-occurrences-solution
  [& args] ;; update args as needed
  ;; Write a function which returns a map containing the number of occurences
  ;; of each distinct item in a sequence.
  nil)


;; problem 56 (Medium)
;; restrictions: distinct
(defn find-distinct-items-solution
  [& args] ;; update args as needed
  ;; Write a function which removes the duplicates from a sequence. Order of
  ;; the items must be maintained.
  nil)


;; problem 57 (Elementary)
(defn simple-recursion-solution
  [& args] ;; update args as needed
  ;; A recursive function is a function which calls itself. This is one of the
  ;; fundamental techniques used in functional programming.
  nil)


;; problem 58 (Medium)
;; restrictions: comp
(defn function-composition-solution
  [& args] ;; update args as needed
  ;; Write a function which allows you to create function compositions. The
  ;; parameter list should take a variable number of functions, and create a
  ;; function applies them from right-to-left.
  nil)


;; problem 59 (Medium)
;; restrictions: juxt
(defn juxtaposition-solution
  [& args] ;; update args as needed
  ;; Take a set of functions and return a new function that takes a variable
  ;; number of arguments and returns a sequence containing the result of
  ;; applying each function left-to-right to the argument list.
  nil)


;; problem 60 (Medium)
;; restrictions: reductions
(defn sequence-reductions-solution
  [& args] ;; update args as needed
  ;; Write a function which behaves like reduce, but returns each intermediate
  ;; value of the reduction. Your function must accept either two or three
  ;; arguments, and the return sequence must be lazy.
  nil)


;; problem 61 (Easy)
;; restrictions: zipmap
(defn map-construction-solution
  [& args] ;; update args as needed
  ;; Write a function which takes a vector of keys and a vector of values and
  ;; constructs a map from them.
  nil)


;; problem 62 (Easy)
;; restrictions: iterate
(defn re-implement-iterate-solution
  [& args] ;; update args as needed
  ;; Given a side-effect free function f and an initial value x write a
  ;; function which returns an infinite lazy sequence of x, (f x), (f (f x)),
  ;; (f (f (f x))), etc.
  nil)


;; problem 63 (Easy)
;; restrictions: group-by
(defn group-a-sequence-solution
  [& args] ;; update args as needed
  ;; Given a function f and a sequence s, write a function which returns a map.
  ;; The keys should be the values of f applied to each item in s. The value at
  ;; each key should be a vector of corresponding items in the order they
  ;; appear in s.
  nil)


;; problem 64 (Elementary)
(defn intro-to-reduce-solution
  [& args] ;; update args as needed
  ;; Reduce takes a 2 argument function and an optional starting value. It then
  ;; applies the function to the first 2 items in the sequence (or the starting
  ;; value and the first element of the sequence). In the next iteration the
  ;; function will be called on the previous return value and the next item
  ;; from the sequence, thus reducing the entire collection to one value. Don't
  ;; worry, it's not as complicated as it sounds.
  nil)


;; problem 65 (Medium)
;; restrictions: class, type, Class, vector?, sequential?, list?, seq?, map?,
;;               set?, instance?, getClass
(defn black-box-testing-solution
  [& args] ;; update args as needed
  ;; Clojure has many sequence types, which act in subtly different ways. The
  ;; core functions typically convert them into a uniform "sequence" type and
  ;; work with them that way, but it can be important to understand the
  ;; behavioral and performance differences so that you know which kind is
  ;; appropriate for your application.
  ;;
  ;; Write a function which takes a collection and returns one of :map, :set,
  ;; :list, or :vector - describing the type of collection it was given. You
  ;; won't be allowed to inspect their class or use the built-in predicates
  ;; like list? - the point is to poke at them and understand their behavior.
  nil)


;; problem 66 (Easy)
(defn greatest-common-divisor-solution
  [& args] ;; update args as needed
  ;; Given two integers, write a function which returns the greatest common
  ;; divisor.
  nil)


;; problem 67 (Medium)
(defn prime-numbers-solution
  [& args] ;; update args as needed
  ;; Write a function which returns the first x number of prime numbers.
  nil)


;; problem 68 (Elementary)
(defn recurring-theme-solution
  [& args] ;; update args as needed
  ;; Clojure only has one non-stack-consuming looping construct: recur. Either
  ;; a function or a loop can be used as the recursion point. Either way, recur
  ;; rebinds the bindings of the recursion point to the values it is passed.
  ;; Recur must be called from the tail-position, and calling it elsewhere will
  ;; result in an error.
  nil)


;; problem 69 (Medium)
;; restrictions: merge-with
(defn merge-with-a-function-solution
  [& args] ;; update args as needed
  ;; Write a function which takes a function f and a variable number of maps.
  ;; Your function should return a map that consists of the rest of the maps
  ;; conj-ed onto the first. If a key occurs in more than one map, the
  ;; mapping(s) from the latter (left-to-right) should be combined with the
  ;; mapping in the result by calling (f val-in-result val-in-latter)
  nil)


;; problem 70 (Medium)
(defn word-sorting-solution
  [& args] ;; update args as needed
  ;; Write a function that splits a sentence up into a sorted list of words.
  ;; Capitalization should not affect sort order and punctuation should be
  ;; ignored.
  nil)


;; problem 71 (Elementary)
(defn rearranging-code-solution
  [& args] ;; update args as needed
  ;; The -> macro threads an expression x through a variable number of forms.
  ;; First, x is inserted as the second item in the first form, making a list
  ;; of it if it is not a list already. Then the first form is inserted as the
  ;; second item in the second form, making a list of that form if necessary.
  ;; This process continues for all the forms. Using -> can sometimes make your
  ;; code more readable.
  nil)


;; problem 73 (Hard)
(defn analyze-a-tic-tac-toe-board-solution
  [& args] ;; update args as needed
  ;; A tic-tac-toe board is represented by a two dimensional vector. X is
  ;; represented by :x, O is represented by :o, and empty is represented by :e.
  ;; A player wins by placing three Xs or three Os in a horizontal, vertical,
  ;; or diagonal row. Write a function which analyzes a tic-tac-toe board and
  ;; returns :x if X has won, :o if O has won, and nil if neither player has
  ;; won.
  nil)


;; problem 74 (Medium)
(defn filter-perfect-squares-solution
  [& args] ;; update args as needed
  ;; Given a string of comma separated integers, write a function which returns
  ;; a new comma separated string that only contains the numbers which are
  ;; perfect squares.
  nil)


;; problem 75 (Medium)
(defn euler-s-totient-function-solution
  [& args] ;; update args as needed
  ;; Two numbers are coprime if their greatest common divisor equals 1. Euler's
  ;; totient function f(x) is defined as the number of positive integers less
  ;; than x which are coprime to x. The special case f(1) equals 1. Write a
  ;; function which calculates Euler's totient function.
  nil)


;; problem 76 (Medium)
(defn intro-to-trampoline-solution
  [& args] ;; update args as needed
  ;; The trampoline function takes a function f and a variable number of
  ;; parameters. Trampoline calls f with any parameters that were supplied. If
  ;; f returns a function, trampoline calls that function with no arguments.
  ;; This is repeated, until the return value is not a function, and then
  ;; trampoline returns that non-function value. This is useful for
  ;; implementing mutually recursive algorithms in a way that won't consume the
  ;; stack.
  nil)


;; problem 77 (Medium)
(defn anagram-finder-solution
  [& args] ;; update args as needed
  ;; Write a function which finds all the anagrams in a vector of words. A word
  ;; x is an anagram of word y if all the letters in x can be rearranged in a
  ;; different order to form y. Your function should return a set of sets,
  ;; where each sub-set is a group of words which are anagrams of each other.
  ;; Each sub-set should have at least two words. Words without any anagrams
  ;; should not be included in the result.
  nil)


;; problem 78 (Medium)
;; restrictions: trampoline
(defn reimplement-trampoline-solution
  [& args] ;; update args as needed
  ;; Reimplement the function described in "Intro to Trampoline".
  nil)


;; problem 79 (Hard)
(defn triangle-minimal-path-solution
  [& args] ;; update args as needed
  ;; Write a function which calculates the sum of the minimal path through a
  ;; triangle. The triangle is represented as a collection of vectors. The path
  ;; should start at the top of the triangle and move to an adjacent number on
  ;; the next row until the bottom of the triangle is reached.
  nil)


;; problem 80 (Medium)
(defn perfect-numbers-solution
  [& args] ;; update args as needed
  ;; A number is "perfect" if the sum of its divisors equal the number itself.
  ;; 6 is a perfect number because 1+2+3=6. Write a function which returns true
  ;; for perfect numbers and false otherwise.
  nil)


;; problem 81 (Easy)
;; restrictions: intersection
(defn set-intersection-solution
  [& args] ;; update args as needed
  ;; Write a function which returns the intersection of two sets. The
  ;; intersection is the sub-set of items that each set has in common.
  nil)


;; problem 82 (Hard)
(defn word-chains-solution
  [& args] ;; update args as needed
  ;; A word chain consists of a set of words ordered so that each word differs
  ;; by only one letter from the words directly before and after it. The one
  ;; letter difference can be either an insertion, a deletion, or a
  ;; substitution. Here is an example word chain:
  ;;
  ;; cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog
  ;;
  ;; Write a function which takes a sequence of words, and returns true if they
  ;; can be arranged into one continous word chain, and false if they cannot.
  nil)


;; problem 83 (Easy)
(defn a-half-truth-solution
  [& args] ;; update args as needed
  ;; Write a function which takes a variable number of booleans. Your function
  ;; should return true if some of the parameters are true, but not all of the
  ;; parameters are true. Otherwise your function should return false.
  nil)


;; problem 84 (Hard)
(defn transitive-closure-solution
  [& args] ;; update args as needed
  ;; Write a function which generates the transitive closure of a binary
  ;; relation. The relation will be represented as a set of 2 item vectors.
  nil)


;; problem 85 (Medium)
(defn power-set-solution
  [& args] ;; update args as needed
  ;; Write a function which generates the power set of a given set. The power
  ;; set of a set x is the set of all subsets of x, including the empty set and
  ;; x itself.
  nil)


;; problem 86 (Medium)
(defn happy-numbers-solution
  [& args] ;; update args as needed
  ;; Happy numbers are positive integers that follow a particular formula: take
  ;; each individual digit, square it, and then sum the squares to get a new
  ;; number. Repeat with the new number and eventually, you might get to a
  ;; number whose squared sum is 1. This is a happy number. An unhappy number
  ;; (or sad number) is one that loops endlessly. Write a function that
  ;; determines if a number is happy or not.
  nil)


;; problem 88 (Easy)
(defn symmetric-difference-solution
  [& args] ;; update args as needed
  ;; Write a function which returns the symmetric difference of two sets. The
  ;; symmetric difference is the set of items belonging to one but not both of
  ;; the two sets.
  nil)


;; problem 89 (Hard)
(defn graph-tour-solution
  [& args] ;; update args as needed
  ;; Starting with a graph you must write a function that returns true if it is
  ;; possible to make a tour of the graph in which every edge is visited
  ;; exactly once.
  ;;
  ;; The graph is represented by a vector of tuples, where each tuple
  ;; represents a single edge.
  ;;
  ;; The rules are:
  ;;
  ;; - You can start at any node.
  ;; - You must visit each edge exactly once. - All edges are undirected.
  nil)


;; problem 90 (Easy)
(defn cartesian-product-solution
  [& args] ;; update args as needed
  ;; Write a function which calculates the Cartesian product of two sets.
  nil)


;; problem 91 (Hard)
(defn graph-connectivity-solution
  [& args] ;; update args as needed
  ;; Given a graph, determine whether the graph is connected. A connected graph
  ;; is such that a path exists between any two given nodes.
  ;;
  ;; -Your function must return true if the graph is connected and false
  ;; otherwise.
  ;; -You will be given a set of tuples representing the edges of a graph. Each
  ;; member of a tuple being a vertex/node in the graph.
  ;; -Each edge is undirected (can be traversed either direction).
  ;;
  nil)


;; problem 92 (Hard)
(defn read-roman-numerals-solution
  [& args] ;; update args as needed
  ;; Roman numerals are easy to recognize, but not everyone knows all the rules
  ;; necessary to work with them. Write a function to parse a Roman-numeral
  ;; string and return the number it represents.
  ;;
  ;; You can assume that the input will be well-formed, in upper-case, and
  ;; follow the subtractive principle. You don't need to handle any numbers
  ;; greater than MMMCMXCIX (3999), the largest number representable with
  ;; ordinary letters.
  nil)


;; problem 93 (Medium)
(defn partially-flatten-a-sequence-solution
  [& args] ;; update args as needed
  ;; Write a function which flattens any nested combination of sequential
  ;; things (lists, vectors, etc.), but maintains the lowest level sequential
  ;; items. The result should be a sequence of sequences with only one level of
  ;; nesting.
  nil)


;; problem 94 (Hard)
(defn game-of-life-solution
  [& args] ;; update args as needed
  ;; The game of life is a cellular automaton devised by mathematician John
  ;; Conway.
  ;;
  ;; The 'board' consists of both live (#) and dead ( ) cells. Each cell
  ;; interacts with its eight neighbours (horizontal, vertical, diagonal), and
  ;; its next state is dependent on the following rules:
  ;;
  ;; 1) Any live cell with fewer than two live neighbours dies, as if caused by
  ;;    under-population.
  ;; 2) Any live cell with two or three live neighbours lives on to the next
  ;;    generation.
  ;; 3) Any live cell with more than three live neighbours dies, as if by
  ;;    overcrowding.
  ;; 4) Any dead cell with exactly three live neighbours becomes a live cell,
  ;;    as if by reproduction.
  ;;
  ;; Write a function that accepts a board, and returns a board representing
  ;; the next generation of cells.
  nil)


;; problem 95 (Easy)
(defn to-tree-or-not-to-tree-solution
  [& args] ;; update args as needed
  ;; Write a predicate which checks whether or not a given sequence represents
  ;; a binary tree. Each node in the tree must have a value, a left child, and
  ;; a right child.
  nil)


;; problem 96 (Easy)
(defn beauty-is-symmetry-solution
  [& args] ;; update args as needed
  ;; Let us define a binary tree as "symmetric" if the left half of the tree is
  ;; the mirror image of the right half of the tree. Write a predicate to
  ;; determine whether or not a given binary tree is symmetric. (see To Tree,
  ;; or not to Tree for a reminder on the tree representation we're using).
  nil)


;; problem 97 (Easy)
(defn pascal-s-triangle-solution
  [& args] ;; update args as needed
  ;; Pascal's triangle is a triangle of numbers computed using the following
  ;; rules:
  ;;  - The first row is 1.
  ;;  - Each successive row is computed by adding together adjacent numbers in
  ;;  the row above, and adding a 1 to the beginning and end of the row.
  ;;
  ;; Write a function which returns the nth row of Pascal's Triangle.
  ;;
  nil)


;; problem 98 (Medium)
(defn equivalence-classes-solution
  [& args] ;; update args as needed
  ;; A function f defined on a domain D induces an equivalence relation on D,
  ;; as follows: a is equivalent to b with respect to f if and only if (f a) is
  ;; equal to (f b). Write a function with arguments f and D that computes the
  ;; equivalence classes of D with respect to f.
  nil)


;; problem 99 (Easy)
(defn product-digits-solution
  [& args] ;; update args as needed
  ;; Write a function which multiplies two numbers and returns the result as a
  ;; sequence of its digits.
  nil)
