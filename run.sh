CP=$(lein classpath)
echo "Classpath: " $CP
rm -rf target/classes
mkdir -p target/classes
javac -cp $CP -d target/classes -sourcepath java java/weird_aot/AClass.java
java -cp $CP clojure.main compile.clj 

