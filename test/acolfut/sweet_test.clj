(ns acolfut.sweet-test
  (:require [acolfut.sweet :refer :all]))

(deftest failure-test
  (testing "this is a failure test"
    (is (= 0 1))))

(deftest error-test
  (testing "this is a error test"
    (is (= 0 (* 1 (:k {}))))))

(deftest success-test
  (testing "this is a success test"
    (is (= 0 3))))
