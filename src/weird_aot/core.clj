(ns weird-aot.core
  (:require [weird-aot.jetty]
            [clojure.core.async])
  (:gen-class))

(defn -main [] (println "hello"))
