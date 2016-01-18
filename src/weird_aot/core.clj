(ns weird-aot.core
  (:require [weird-aot.jetty]
            [clojure.tools.analyzer.jvm])
  (:gen-class))

(defn -main [] (println "hello"))
