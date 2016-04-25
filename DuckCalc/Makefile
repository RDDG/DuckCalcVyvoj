dist/DuckCalc.jar:
	ant jar

pack:
	ant jar

all: build.xml
	ant run

test: build.xml
	cd ../DuckCalcMath; ant test
	
clean:
	rm -rf build/* dist/* ..ant 
	rmdir dist
	rmdir build
