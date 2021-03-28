(ns lemon.core)

(defmacro numord
  "Numord is a number order control. It return boolean value
   Exp: (numord 1 < 2 < 4) ;; true"
  [& expr]
  (loop [e expr
         r [true]]
   (if (< (count e) 3)
     `(every? true? ~r)
     (let [t (take 3 e)
           k (list (second t) (first t) (last t))]
       (recur (drop 2 e) (conj r k))))))

(defmacro when-n
  "when-n have three parameters.
   default is default value
   test is condition
   body is return block"
  [default test & body]
  (list 'if test (cons 'do body) default))

(defmacro unless
  "unless"
  [test & branches]
  (conj (take 2 (reverse branches)) test 'if))

(defmacro mergep
  "expr is map
   clauses has conditions and body
   Example: (mergep {:a :b} true {:a :c})"
  [expr & clauses]
  (assert (even? (count clauses)))
  (reduce (fn [k v]
            (if (first v) (merge k (last v)) k))
          (conj (partition 2 clauses) expr)))
