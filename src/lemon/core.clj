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
