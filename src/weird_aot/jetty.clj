(ns weird-aot.jetty
  (:import (weird_aot AClass)))

(defn- ac []
  (proxy [AClass] []))

