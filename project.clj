(defproject weird-aot "0.1.0"
  :description "FIXME: write description"
  :packaging "jar"

  :exclusions [org.clojure/clojurescript]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.slf4j/slf4j-api "1.7.13"]
                 [com.fzakaria/slf4j-timbre "0.2.2"]
                 [org.clojure/tools.reader "1.0.0-alpha2"]
                 [com.taoensso/timbre "4.2.0"]
                 [org.clojure/core.async "0.2.374"]
                 [org.clojure/tools.analyzer.jvm "0.6.9"]]
  :java-source-paths ["java/"]
  :aot :all
  :main weird-aot.core)

