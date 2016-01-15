(defproject weird-aot "0.1.0"
  :description "FIXME: write description"
  :packaging "jar"

  :exclusions [org.clojure/clojurescript]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring "1.4.0"]
                 [org.clojure/core.async "0.2.374"]
                 [com.fzakaria/slf4j-timbre "0.2.2"]
                 [com.taoensso/timbre "4.2.0"]]

  :aot :all
  :main weird-aot.core)
  

