## Acolfut

a coloful test framework for clojure inspired by clojure.test

[![Clojars Project](http://clojars.org/acolfut/latest-version.svg)](http://clojars.org/acolfut)

## Usage

* project.clj

```clojure
:dependencies [[acolfut "0.3.0"]]
:plugins [[lein-colortest "0.3.0"]]
```

* testfile.clj

```clojure
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
    (is (= 0 0))))
```

## License

Copyright © 2015 jihui

Distributed under the Eclipse Public License, the same as Clojure.
