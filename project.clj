(defproject acolfut "0.1.0"
  :description "a coloful test framework for clojure inspired by clojure.test"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot acolfut.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})