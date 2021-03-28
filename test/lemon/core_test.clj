(ns lemon.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [lemon.core :as core]))

(deftest numord-test
  (testing "form-1"
    (is (= (core/numord 2 < 3 < 4) true)))
  (testing "form-2"
    (is (= (core/numord -1 < 3 < 4) true)))
  (testing "form-3"
    (is (= (core/numord 6 < 3 < 4) false)))
  (testing "form-4"
    (is (= (core/numord 6 <= 6 < 7) true)))
  (testing "form-5"
    (is (= (core/numord 6 = 6 = 6) true)))
  (testing "form-6"
    (is (= (core/numord -6 <= 0 > -1) true)))
  (testing "form-7"
    (is (= (core/numord 1 > 6 > 7) false)))
  (testing "form-8"
    (is (= (core/numord -6 <= 6 > 5) true))))
