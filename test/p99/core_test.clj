(ns p99.core-test
  (:require [clojure.test :refer :all]
            [p99.core :refer :all]))

;; problem 1
(deftest can-nothing-but-the-truth
  (is (= nothing-but-the-truth-solution true)))


;; problem 2
(deftest can-simple-math
  (is (= (- 10 (* 2 3)) simple-math-solution)))


;; problem 3
(deftest can-intro-to-strings
  (is (= intro-to-strings-solution (.toUpperCase "hello world"))))


;; problem 4
(deftest can-intro-to-lists
  (is (= (list intro-to-lists-solution) '(:a :b :c))))


;; problem 5
(deftest can-lists-conj
  (is (= lists-conj-solution (conj '(2 3 4) 1)))
  (is (= lists-conj-solution (conj '(3 4) 2 1))))


;; problem 6
(deftest can-intro-to-vectors
  (is (= [intro-to-vectors-solution] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))


;; problem 7
(deftest can-vectors-conj
  (is (= vectors-conj-solution (conj [1 2 3] 4)))
  (is (= vectors-conj-solution (conj [1 2] 3 4))))


;; problem 8
(deftest can-intro-to-sets
  (is (= intro-to-sets-solution (set '(:a :a :b :c :c :c :c :d :d))))
  (is (= intro-to-sets-solution (clojure.set/union #{:a :b :c} #{:b :c :d}))))


;; problem 9
(deftest can-sets-conj
  (is (= #{1 2 3 4} (conj #{1 4 3} sets-conj-solution))))


;; problem 10
(deftest can-intro-to-maps
  (is (= intro-to-maps-solution ((hash-map :a 10, :b 20, :c 30) :b)))
  (is (= intro-to-maps-solution (:b {:a 10, :b 20, :c 30}))))


;; problem 11
(deftest can-maps-conj
  (is (= {:a 1, :b 2, :c 3} (conj {:a 1} maps-conj-solution [:c 3]))))


;; problem 12
(deftest can-intro-to-sequences
  (is (= intro-to-sequences-solution (first '(3 2 1))))
  (is (= intro-to-sequences-solution (second [2 3 4])))
  (is (= intro-to-sequences-solution (last (list 1 2 3)))))


;; problem 13
(deftest can-sequences-rest
  (is (= sequences-rest-solution (rest [10 20 30 40]))))


;; problem 14
(deftest can-intro-to-functions
  (is (= intro-to-functions-solution ((fn add-five [x] (+ x 5)) 3)))
  (is (= intro-to-functions-solution ((fn [x] (+ x 5)) 3)))
  (is (= intro-to-functions-solution (#(+ % 5) 3)))
  (is (= intro-to-functions-solution ((partial + 5) 3))))


;; problem 15
(deftest can-double-down
  (is (= (double-down-solution 2) 4))
  (is (= (double-down-solution 3) 6))
  (is (= (double-down-solution 11) 22))
  (is (= (double-down-solution 7) 14)))


;; problem 16
(deftest can-hello-world
  (is (= (hello-world-solution "Dave") "Hello, Dave!"))
  (is (= (hello-world-solution "Jenn") "Hello, Jenn!"))
  (is (= (hello-world-solution "Rhea") "Hello, Rhea!")))


;; problem 17
(deftest can-sequences-map
  (is (= sequences-map-solution (map #(+ % 5) '(1 2 3)))))


;; problem 18
(deftest can-sequences-filter
  (is (= sequences-filter-solution (filter #(> % 5) '(3 4 5 6 7)))))


;; problem 19
(deftest can-last-element
  (is (= (last-element-solution [1 2 3 4 5]) 5))
  (is (= (last-element-solution '(5 4 3)) 3))
  (is (= (last-element-solution ["b" "c" "d"]) "d")))


;; problem 20
(deftest can-penultimate-element
  (is (= (penultimate-element-solution (list 1 2 3 4 5)) 4))
  (is (= (penultimate-element-solution ["a" "b" "c"]) "b"))
  (is (= (penultimate-element-solution [[1 2] [3 4]]) [1 2])))


;; problem 21
(deftest can-nth-element
  (is (= (nth-element-solution '(4 5 6 7) 2) 6))
  (is (= (nth-element-solution [:a :b :c] 0) :a))
  (is (= (nth-element-solution [1 2 3 4] 1) 2))
  (is (= (nth-element-solution '([1 2] [3 4] [5 6]) 2) [5 6])))


;; problem 22
(deftest can-count-a-sequence
  (is (= (count-a-sequence-solution '(1 2 3 3 1)) 5))
  (is (= (count-a-sequence-solution "Hello World") 11))
  (is (= (count-a-sequence-solution [[1 2] [3 4] [5 6]]) 3))
  (is (= (count-a-sequence-solution '(13)) 1))
  (is (= (count-a-sequence-solution '(:a :b :c)) 3)))


;; problem 23
(deftest can-reverse-a-sequence
  (is (= (reverse-a-sequence-solution [1 2 3 4 5]) [5 4 3 2 1]))
  (is (= (reverse-a-sequence-solution (sorted-set 5 7 2 7)) '(7 5 2)))
  (is (= (reverse-a-sequence-solution [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])))


;; problem 24
(deftest can-sum-it-all-up
  (is (= (sum-it-all-up-solution [1 2 3]) 6))
  (is (= (sum-it-all-up-solution (list 0 -2 5 5)) 8))
  (is (= (sum-it-all-up-solution #{4 2 1}) 7))
  (is (= (sum-it-all-up-solution '(0 0 -1)) -1))
  (is (= (sum-it-all-up-solution '(1 10 3)) 14)))


;; problem 25
(deftest can-find-the-odd-numbers
  (is (= (find-the-odd-numbers-solution #{1 2 3 4 5}) '(1 3 5)))
  (is (= (find-the-odd-numbers-solution [4 2 1 6]) '(1)))
  (is (= (find-the-odd-numbers-solution [2 2 4 6]) '()))
  (is (= (find-the-odd-numbers-solution [1 1 1 3]) '(1 1 1 3))))


;; problem 26
(deftest can-fibonacci-sequence
  (is (= (fibonacci-sequence-solution 3) '(1 1 2)))
  (is (= (fibonacci-sequence-solution 6) '(1 1 2 3 5 8)))
  (is (= (fibonacci-sequence-solution 8) '(1 1 2 3 5 8 13 21))))


;; problem 27
(deftest can-palindrome-detector
  (is (false? (palindrome-detector-solution '(1 2 3 4 5))))
  (is (true? (palindrome-detector-solution "racecar")))
  (is (true? (palindrome-detector-solution [:foo :bar :foo])))
  (is (true? (palindrome-detector-solution '(1 1 3 3 1 1))))
  (is (false? (palindrome-detector-solution '(:a :b :c)))))


;; problem 28
(deftest can-flatten-a-sequence
  (is (= (flatten-a-sequence-solution '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (is (= (flatten-a-sequence-solution ["a" ["b"] "c"]) '("a" "b" "c")))
  (is (= (flatten-a-sequence-solution '((((:a))))) '(:a))))


;; problem 29
(deftest can-get-the-caps
  (is (= (get-the-caps-solution "HeLlO, WoRlD!") "HLOWRD"))
  (is (empty? (get-the-caps-solution "nothing")))
  (is (= (get-the-caps-solution "$#A(*&987Zf") "AZ")))


;; problem 30
(deftest can-compress-a-sequence
  (is (= (apply str (compress-a-sequence-solution "Leeeeeerrroyyy")) "Leroy"))
  (is (= (compress-a-sequence-solution [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (is (= (compress-a-sequence-solution [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))


;; problem 31
(deftest can-pack-a-sequence
  (is (= (pack-a-sequence-solution [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
  (is (= (pack-a-sequence-solution [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
  (is (= (pack-a-sequence-solution [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))))


;; problem 32
(deftest can-duplicate-a-sequence
  (is (= (duplicate-a-sequence-solution [1 2 3]) '(1 1 2 2 3 3)))
  (is (= (duplicate-a-sequence-solution [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
  (is (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))


;; problem 33
(deftest can-replicate-a-sequence
  (is (= (replicate-a-sequence-solution [1 2 3] 2) '(1 1 2 2 3 3)))
  (is (= (replicate-a-sequence-solution [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
  (is (= (replicate-a-sequence-solution [4 5 6] 1) '(4 5 6)))
  (is (= (replicate-a-sequence-solution [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (replicate-a-sequence-solution [44 33] 2) [44 44 33 33])))


;; problem 34
(deftest can-implement-range
  (is (= (implement-range-solution 1 4) '(1 2 3)))
  (is (= (implement-range-solution -2 2) '(-2 -1 0 1)))
  (is (= (implement-range-solution 5 8) '(5 6 7))))


;; problem 35
(deftest can-local-bindings
  (is (= local-bindings-solution (let [x 5] (+ 2 x))))
  (is (= local-bindings-solution (let [x 3, y 10] (- y x))))
  (is (= local-bindings-solution (let [x 21] (let [y 3] (/ x y))))))


;; problem 36
(deftest can-let-it-be
  (is (= 10 (let let-it-be-solution (+ x y))))
  (is (= 4 (let let-it-be-solution (+ y z))))
  (is (= 1 (let let-it-be-solution z))))


;; problem 37
(deftest can-regular-expressions
  (is (= regular-expressions-solution (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))))


;; problem 38
(deftest can-maximum-value
  (is (= (maximum-value-solution 1 8 3 4) 8))
  (is (= (maximum-value-solution 30 20) 30))
  (is (= (maximum-value-solution 45 67 11) 67)))


;; problem 39
(deftest can-interleave-two-seqs
  (is (= (interleave-two-seqs-solution [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
  (is (= (interleave-two-seqs-solution [1 2] [3 4 5 6]) '(1 3 2 4)))
  (is (= (interleave-two-seqs-solution [1 2 3 4] [5]) [1 5]))
  (is (= (interleave-two-seqs-solution [30 20] [25 15]) [30 25 20 15])))


;; problem 40
(deftest can-interpose-a-seq
  (is (= (interpose-a-seq-solution 0 [1 2 3]) [1 0 2 0 3]))
  (is (= (apply str (interpose-a-seq-solution ", " ["one" "two" "three"])) "one, two, three"))
  (is (= (interpose-a-seq-solution :z [:a :b :c :d]) [:a :z :b :z :c :z :d])))


;; problem 41
(deftest can-drop-every-nth-item
  (is (= (drop-every-nth-item-solution [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
  (is (= (drop-every-nth-item-solution [:a :b :c :d :e :f] 2) [:a :c :e]))
  (is (= (drop-every-nth-item-solution [1 2 3 4 5 6] 4) [1 2 3 5 6])))


;; problem 42
(deftest can-factorial-fun
  (is (= (factorial-fun-solution 1) 1))
  (is (= (factorial-fun-solution 3) 6))
  (is (= (factorial-fun-solution 5) 120))
  (is (= (factorial-fun-solution 8) 40320)))


;; problem 43
(deftest can-reverse-interleave
  (is (= (reverse-interleave-solution [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
  (is (= (reverse-interleave-solution (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
  (is (= (reverse-interleave-solution (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))))


;; problem 44
(deftest can-rotate-sequence
  (is (= (rotate-sequence-solution 2 [1 2 3 4 5]) '(3 4 5 1 2)))
  (is (= (rotate-sequence-solution -2 [1 2 3 4 5]) '(4 5 1 2 3)))
  (is (= (rotate-sequence-solution 6 [1 2 3 4 5]) '(2 3 4 5 1)))
  (is (= (rotate-sequence-solution 1 '(:a :b :c)) '(:b :c :a)))
  (is (= (rotate-sequence-solution -4 '(:a :b :c)) '(:c :a :b))))


;; problem 45
(deftest can-intro-to-iterate
  (is (= intro-to-iterate-solution (take 5 (iterate #(+ 3 %) 1)))))


;; problem 46
(deftest can-flipping-out
  (is (= 3 ((flipping-out-solution nth) 2 [1 2 3 4 5])))
  (is (= true ((flipping-out-solution >) 7 8)))
  (is (= 4 ((flipping-out-solution quot) 2 8)))
  (is (= [1 2 3] ((flipping-out-solution take) [1 2 3 4 5] 3))))


;; problem 47
(deftest can-contain-yourself
  (is (contains? #{4 5 6} contain-yourself-solution))
  (is (contains? [1 1 1 1 1] contain-yourself-solution))
  (is (contains? {4 :a 2 :b} contain-yourself-solution))
  (is (not (contains? '(1 2 4) contain-yourself-solution))))


;; problem 48
(deftest can-intro-to-some
  (is (= intro-to-some-solution (some #{2 7 6} [5 6 7 8])))
  (is (= intro-to-some-solution (some #(when (even? %) %) [5 6 7 8]))))


;; problem 49
(deftest can-split-a-sequence
  (is (= (split-a-sequence-solution 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
  (is (= (split-a-sequence-solution 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
  (is (= (split-a-sequence-solution 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])))


;; problem 50
(deftest can-split-by-type
  (is (= (set (split-by-type-solution [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}))
  (is (= (set (split-by-type-solution [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]}))
  (is (= (set (split-by-type-solution [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})))


;; problem 51
(deftest can-advanced-destructuring
  (is (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] advanced-destructuring-solution] [a b c d]))))


;; problem 52
(deftest can-intro-to-destructuring
  (is (= [2 4] (let [[a b c d e f g] (range)] intro-to-destructuring-solution))))


;; problem 53
(deftest can-longest-increasing-sub-seq
  (is (= (longest-increasing-sub-seq-solution [1 0 1 2 3 0 4 5]) [0 1 2 3]))
  (is (= (longest-increasing-sub-seq-solution [5 6 1 3 2 7]) [5 6]))
  (is (= (longest-increasing-sub-seq-solution [2 3 3 4 5]) [3 4 5]))
  (is (= (longest-increasing-sub-seq-solution [7 6 5 4]) [])))


;; problem 54
(deftest can-partition-a-sequence
  (is (= (partition-a-sequence-solution 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
  (is (= (partition-a-sequence-solution 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
  (is (= (partition-a-sequence-solution 3 (range 8)) '((0 1 2) (3 4 5)))))


;; problem 55
(deftest can-count-occurrences
  (is (= (count-occurrences-solution [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
  (is (= (count-occurrences-solution [:b :a :b :a :b]) {:a 2, :b 3}))
  (is (= (count-occurrences-solution '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})))


;; problem 56
(deftest can-find-distinct-items
  (is (= (find-distinct-items-solution [1 2 1 3 1 2 4]) [1 2 3 4]))
  (is (= (find-distinct-items-solution [:a :a :b :b :c :c]) [:a :b :c]))
  (is (= (find-distinct-items-solution '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
  (is (= (find-distinct-items-solution (range 50)) (range 50))))


;; problem 57
(deftest can-simple-recursion
  (is (= simple-recursion-solution ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))))


;; problem 58
(deftest can-function-composition
  (is (= [3 2 1] ((function-composition-solution rest reverse) [1 2 3 4])))
  (is (= 5 ((function-composition-solution (partial + 3) second) [1 2 3 4])))
  (is (= true ((function-composition-solution zero? #(mod % 8) +) 3 5 7 9)))
  (is (= "HELLO" ((function-composition-solution #(.toUpperCase %) #(apply str %) take) 5 "hello world"))))


;; problem 59
(deftest can-juxtaposition
  (is (= [21 6 1] ((juxtaposition-solution + max min) 2 3 5 1 6 4)))
  (is (= ["HELLO" 5] ((juxtaposition-solution #(.toUpperCase %) count) "hello")))
  (is (= [2 6 4] ((juxtaposition-solution :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))))


;; problem 60
(deftest can-sequence-reductions
  (is (= (take 5 (sequence-reductions-solution + (range))) [0 1 3 6 10]))
  (is (= (sequence-reductions-solution conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
  (is (= (last (sequence-reductions-solution * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)))


;; problem 61
(deftest can-map-construction
  (is (= (map-construction-solution [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))
  (is (= (map-construction-solution [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))
  (is (= (map-construction-solution [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})))


;; problem 62
(deftest can-re-implement-iterate
  (is (= (take 5 (re-implement-iterate-solution #(* 2 %) 1)) [1 2 4 8 16]))
  (is (= (take 100 (re-implement-iterate-solution inc 0)) (take 100 (range))))
  (is (= (take 9 (re-implement-iterate-solution #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))))


;; problem 63
(deftest can-group-a-sequence
  (is (= (group-a-sequence-solution #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]}))
  (is (= (group-a-sequence-solution #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
   {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}))
  (is (= (group-a-sequence-solution count [[1] [1 2] [3] [1 2 3] [2 3]])
   {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})))


;; problem 64
(deftest can-intro-to-reduce
  (is (= 15 (reduce intro-to-reduce-solution [1 2 3 4 5])))
  (is (=  0 (reduce intro-to-reduce-solution [])))
  (is (=  6 (reduce intro-to-reduce-solution 1 [2 3]))))


;; problem 65
(deftest can-black-box-testing
  (is (= :map (black-box-testing-solution {:a 1, :b 2})))
  (is (= :list (black-box-testing-solution (range (rand-int 20)))))
  (is (= :vector (black-box-testing-solution [1 2 3 4 5 6])))
  (is (= :set (black-box-testing-solution #{10 (rand-int 5)})))
  (is (= [:map :set :vector :list] (map black-box-testing-solution [{} #{} [] ()]))))


;; problem 66
(deftest can-greatest-common-divisor
  (is (= (greatest-common-divisor-solution 2 4) 2))
  (is (= (greatest-common-divisor-solution 10 5) 5))
  (is (= (greatest-common-divisor-solution 5 7) 1))
  (is (= (greatest-common-divisor-solution 1023 858) 33)))


;; problem 67
(deftest can-prime-numbers
  (is (= (prime-numbers-solution 2) [2 3]))
  (is (= (prime-numbers-solution 5) [2 3 5 7 11]))
  (is (= (last (prime-numbers-solution 100)) 541)))


;; problem 68
(deftest can-recurring-theme
  (is (= recurring-theme-solution
  (loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result)))))


;; problem 69
(deftest can-merge-with-a-function
  (is (= (merge-with-a-function-solution * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
   {:a 4, :b 6, :c 20}))
  (is (= (merge-with-a-function-solution - {1 10, 2 20} {1 3, 2 10, 3 15})
   {1 7, 2 10, 3 15}))
  (is (= (merge-with-a-function-solution concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
   {:a [3 4 5], :b [6 7], :c [8 9]})))


;; problem 70
(deftest can-word-sorting
  (is (= (word-sorting-solution  "Have a nice day.")
   ["a" "day" "Have" "nice"]))
  (is (= (word-sorting-solution  "Clojure is a fun language!")
   ["a" "Clojure" "fun" "is" "language"]))
  (is (= (word-sorting-solution  "Fools fall for foolish follies.")
   ["fall" "follies" "foolish" "Fools" "for"])))


;; problem 71
(deftest can-rearranging-code
  (is (= (rearranging-code-solution (sort (rest (reverse [2 5 4 1 3 6]))))
   (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (rearranging-code-solution))
   5)))


;; problem 73
(deftest can-analyze-a-tic-tac-toe-board
  (is (= nil (analyze-a-tic-tac-toe-board-solution [[:e :e :e]
            [:e :e :e]
            [:e :e :e]])))
  (is (= :x (analyze-a-tic-tac-toe-board-solution [[:x :e :o]
           [:x :e :e]
           [:x :e :o]])))
  (is (= :o (analyze-a-tic-tac-toe-board-solution [[:e :x :e]
           [:o :o :o]
           [:x :e :x]])))
  (is (= nil (analyze-a-tic-tac-toe-board-solution [[:x :e :o]
            [:x :x :e]
            [:o :x :o]])))
  (is (= :x (analyze-a-tic-tac-toe-board-solution [[:x :e :e]
           [:o :x :e]
           [:o :e :x]])))
  (is (= :o (analyze-a-tic-tac-toe-board-solution [[:x :e :o]
           [:x :o :e]
           [:o :e :x]])))
  (is (= nil (analyze-a-tic-tac-toe-board-solution [[:x :o :x]
            [:x :o :x]
            [:o :x :o]]))))


;; problem 74
(deftest can-filter-perfect-squares
  (is (= (filter-perfect-squares-solution "4,5,6,7,8,9") "4,9"))
  (is (= (filter-perfect-squares-solution "15,16,25,36,37") "16,25,36")))


;; problem 75
(deftest can-euler-s-totient-function
  (is (= (euler-s-totient-function-solution 1) 1))
  (is (= (euler-s-totient-function-solution 10) (count '(1 3 7 9)) 4))
  (is (= (euler-s-totient-function-solution 40) 16))
  (is (= (euler-s-totient-function-solution 99) 60)))


;; problem 76
(deftest can-intro-to-trampoline
  (is (= intro-to-trampoline-solution
   (letfn
     [(foo [x y] #(bar (conj x y) y))
      (bar [x y] (if (> (last x) 10)
                   x
                   #(foo x (+ 2 y))))]
     (trampoline foo [] 1)))))


;; problem 77
(deftest can-anagram-finder
  (is (= (anagram-finder-solution ["meat" "mat" "team" "mate" "eat"])
   #{#{"meat" "team" "mate"}}))
  (is (= (anagram-finder-solution ["veer" "lake" "item" "kale" "mite" "ever"])
   #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})))


;; problem 78
(deftest can-reimplement-trampoline
  (is (= (letfn [(triple [x] #(sub-two (* 3 x)))
          (sub-two [x] #(stop?(- x 2)))
          (stop? [x] (if (> x 50) x #(triple x)))]
    (reimplement-trampoline-solution triple 2))
  82))
  (is (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
          (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
    (map (partial reimplement-trampoline-solution my-even?) (range 6)))
  [true false true false true false])))


;; problem 79
(deftest can-triangle-minimal-path
  (is (= 7 (triangle-minimal-path-solution '([1]
          [2 4]
         [5 1 4]
        [2 3 4 5]))) ; 1->2->1->3)
  (is (= 20 (triangle-minimal-path-solution '([3]
           [2 4]
          [1 9 3]
         [9 9 2 4]
        [4 6 6 7 8]
       [5 7 3 5 1 4]))) ; 3->4->3->2->7->1))


;; problem 80
(deftest can-perfect-numbers
  (is (= (perfect-numbers-solution 6) true))
  (is (= (perfect-numbers-solution 7) false))
  (is (= (perfect-numbers-solution 496) true))
  (is (= (perfect-numbers-solution 500) false))
  (is (= (perfect-numbers-solution 8128) true)))


;; problem 81
(deftest can-set-intersection
  (is (= (set-intersection-solution #{0 1 2 3} #{2 3 4 5}) #{2 3}))
  (is (= (set-intersection-solution #{0 1 2} #{3 4 5}) #{}))
  (is (= (set-intersection-solution #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})))


;; problem 82
(deftest can-word-chains
  (is (= true (word-chains-solution #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})))
  (is (= false (word-chains-solution #{"cot" "hot" "bat" "fat"})))
  (is (= false (word-chains-solution #{"to" "top" "stop" "tops" "toss"})))
  (is (= true (word-chains-solution #{"spout" "do" "pot" "pout" "spot" "dot"})))
  (is (= true (word-chains-solution #{"share" "hares" "shares" "hare" "are"})))
  (is (= false (word-chains-solution #{"share" "hares" "hare" "are"}))))


;; problem 83
(deftest can-a-half-truth
  (is (= false (a-half-truth-solution false false)))
  (is (= true (a-half-truth-solution true false)))
  (is (= false (a-half-truth-solution true)))
  (is (= true (a-half-truth-solution false true false)))
  (is (= false (a-half-truth-solution true true true)))
  (is (= true (a-half-truth-solution true true true false))))


;; problem 84
(deftest can-transitive-closure
  (is (let [divides #{[8 4] [9 3] [4 2] [27 9]}]
  (= (transitive-closure-solution divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]})))
  (is (let [more-legs
      #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}]
  (= (transitive-closure-solution more-legs)
     #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
       ["spider" "cat"] ["spider" "man"] ["spider" "snake"]})))
  (is (let [progeny
      #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}]
  (= (transitive-closure-solution progeny)
     #{["father" "son"] ["father" "grandson"]
       ["uncle" "cousin"] ["son" "grandson"]}))))


;; problem 85
(deftest can-power-set
  (is (= (power-set-solution #{1 :a}) #{#{1 :a} #{:a} #{} #{1}}))
  (is (= (power-set-solution #{}) #{#{}}))
  (is (= (power-set-solution #{1 2 3})
   #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}}))
  (is (= (count (power-set-solution (into #{} (range 10)))) 1024)))


;; problem 86
(deftest can-happy-numbers
  (is (= (happy-numbers-solution 7) true))
  (is (= (happy-numbers-solution 986543210) true))
  (is (= (happy-numbers-solution 2) false))
  (is (= (happy-numbers-solution 3) false)))


;; problem 88
(deftest can-symmetric-difference
  (is (= (symmetric-difference-solution #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7}))
  (is (= (symmetric-difference-solution #{:a :b :c} #{}) #{:a :b :c}))
  (is (= (symmetric-difference-solution #{} #{4 5 6}) #{4 5 6}))
  (is (= (symmetric-difference-solution #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})))


;; problem 89
(deftest can-graph-tour
  (is (= true (graph-tour-solution [[:a :b]])))
  (is (= false (graph-tour-solution [[:a :a] [:b :b]])))
  (is (= false (graph-tour-solution [[:a :b] [:a :b] [:a :c] [:c :a]
               [:a :d] [:b :d] [:c :d]])))
  (is (= true (graph-tour-solution [[1 2] [2 3] [3 4] [4 1]])))
  (is (= true (graph-tour-solution [[:a :b] [:a :c] [:c :b] [:a :e]
              [:b :e] [:a :d] [:b :d] [:c :e]
              [:d :e] [:c :f] [:d :f]])))
  (is (= false (graph-tour-solution [[1 2] [2 3] [2 4] [2 5]]))))


;; problem 90
(deftest can-cartesian-product
  (is (= (cartesian-product-solution #{"ace" "king" "queen"} #{"&#9824;" "&#9829;" "&#9830;" "&#9827;"})
   #{["ace"   "&#9824;"] ["ace"   "&#9829;"] ["ace"   "&#9830;"] ["ace"   "&#9827;"]
     ["king"  "&#9824;"] ["king"  "&#9829;"] ["king"  "&#9830;"] ["king"  "&#9827;"]
     ["queen" "&#9824;"] ["queen" "&#9829;"] ["queen" "&#9830;"] ["queen" "&#9827;"]}))
  (is (= (cartesian-product-solution #{1 2 3} #{4 5})
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}))
  (is (= 300 (count (cartesian-product-solution (into #{} (range 10))
                  (into #{} (range 30)))))))


;; problem 91
(deftest can-graph-connectivity
  (is (= true (graph-connectivity-solution #{[:a :a]})))
  (is (= true (graph-connectivity-solution #{[:a :b]})))
  (is (= false (graph-connectivity-solution #{[1 2] [2 3] [3 1]
               [4 5] [5 6] [6 4]})))
  (is (= true (graph-connectivity-solution #{[1 2] [2 3] [3 1]
              [4 5] [5 6] [6 4] [3 4]})))
  (is (= false (graph-connectivity-solution #{[:a :b] [:b :c] [:c :d]
               [:x :y] [:d :a] [:b :e]})))
  (is (= true (graph-connectivity-solution #{[:a :b] [:b :c] [:c :d]
              [:x :y] [:d :a] [:b :e] [:x :a]}))))


;; problem 92
(deftest can-read-roman-numerals
  (is (= 14 (read-roman-numerals-solution "XIV")))
  (is (= 827 (read-roman-numerals-solution "DCCCXXVII")))
  (is (= 3999 (read-roman-numerals-solution "MMMCMXCIX")))
  (is (= 48 (read-roman-numerals-solution "XLVIII"))
))


;; problem 93
(deftest can-partially-flatten-a-sequence
  (is (= (partially-flatten-a-sequence-solution [["Do"] ["Nothing"]])
   [["Do"] ["Nothing"]]))
  (is (= (partially-flatten-a-sequence-solution [[[[:a :b]]] [[:c :d]] [:e :f]])
   [[:a :b] [:c :d] [:e :f]]))
  (is (= (partially-flatten-a-sequence-solution '((1 2)((3 4)((((5 6)))))))
   '((1 2)(3 4)(5 6)))))


;; problem 94
(deftest can-game-of-life
  (is (= (game-of-life-solution ["      "  
        " ##   "
        " ##   "
        "   ## "
        "   ## "
        "      "])
   ["      "  
    " ##   "
    " #    "
    "    # "
    "   ## "
    "      "]))
  (is (= (game-of-life-solution ["     "
        "     "
        " ### "
        "     "
        "     "])
   ["     "
    "  #  "
    "  #  "
    "  #  "
    "     "]))
  (is (= (game-of-life-solution ["      "
        "      "
        "  ### "
        " ###  "
        "      "
        "      "])
   ["      "
    "   #  "
    " #  # "
    " #  # "
    "  #   "
    "      "])))


;; problem 95
(deftest can-to-tree-or-not-to-tree
  (is (= (to-tree-or-not-to-tree-solution '(:a (:b nil nil) nil))
   true))
  (is (= (to-tree-or-not-to-tree-solution '(:a (:b nil nil)))
   false))
  (is (= (to-tree-or-not-to-tree-solution [1 nil [2 [3 nil nil] [4 nil nil]]])
   true))
  (is (= (to-tree-or-not-to-tree-solution [1 [2 nil nil] [3 nil nil] [4 nil nil]])
   false))
  (is (= (to-tree-or-not-to-tree-solution [1 [2 [3 [4 nil nil] nil] nil] nil])
   true))
  (is (= (to-tree-or-not-to-tree-solution [1 [2 [3 [4 false nil] nil] nil] nil])
   false))
  (is (= (to-tree-or-not-to-tree-solution '(:a nil ()))
   false)
))


;; problem 96
(deftest can-beauty-is-symmetry
  (is (= (beauty-is-symmetry-solution '(:a (:b nil nil) (:b nil nil))) true))
  (is (= (beauty-is-symmetry-solution '(:a (:b nil nil) nil)) false))
  (is (= (beauty-is-symmetry-solution '(:a (:b nil nil) (:c nil nil))) false))
  (is (= (beauty-is-symmetry-solution [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
   true))
  (is (= (beauty-is-symmetry-solution [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
   false))
  (is (= (beauty-is-symmetry-solution [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [6 nil nil] nil]] nil]])
   false)))


;; problem 97
(deftest can-pascal-s-triangle
  (is (= (pascal-s-triangle-solution 1) [1]))
  (is (= (map pascal-s-triangle-solution (range 1 6))
   [     [1]
        [1 1]
       [1 2 1]
      [1 3 3 1]
     [1 4 6 4 1]]))
  (is (= (pascal-s-triangle-solution 11)
   [1 10 45 120 210 252 210 120 45 10 1])))


;; problem 98
(deftest can-equivalence-classes
  (is (= (equivalence-classes-solution #(* % %) #{-2 -1 0 1 2})
   #{#{0} #{1 -1} #{2 -2}}))
  (is (= (equivalence-classes-solution #(rem % 3) #{0 1 2 3 4 5 })
   #{#{0 3} #{1 4} #{2 5}}))
  (is (= (equivalence-classes-solution identity #{0 1 2 3 4})
   #{#{0} #{1} #{2} #{3} #{4}}))
  (is (= (equivalence-classes-solution (constantly true) #{0 1 2 3 4})
   #{#{0 1 2 3 4}})
))


;; problem 99
(deftest can-product-digits
  (is (= (product-digits-solution 1 1) [1]))
  (is (= (product-digits-solution 99 9) [8 9 1]))
  (is (= (product-digits-solution 999 99) [9 8 9 0 1])))
