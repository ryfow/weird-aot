CP=$(lein classpath)
echo "Classpath: " $CP
java -cp $CP clojure.main compile.clj 

