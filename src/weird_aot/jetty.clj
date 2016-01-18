(ns weird-aot.jetty
  (:import [org.eclipse.jetty.server.handler AbstractHandler]))

(defn- proxy-handler [handler]
  (proxy [AbstractHandler] []
    (handle [_ base-request request response])))

