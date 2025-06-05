all: Main

Main:
	javac -cp src -d out src/*.java

jar:
	javac -cp src -d out src/*.java && cd out && jar cfe ../Claim.jar Claim *.class */*.class -C .. res