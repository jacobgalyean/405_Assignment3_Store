JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

CLASSES = \
        client/Login.java \
        common/FrontController.java \
	server/FrontControllerRemote.java\
	server/Dispatcher.java\
        server/AdminView.java \
        server/CustomerView.java \
	server/Server.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
        $(RM) *.class