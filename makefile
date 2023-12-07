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
        server/Add_Item_Cmd.java \
        server/Admin_Cmd.java \
        server/Cart_Cmds.java \
        server/Checkout_Cmd.java \
        server/Cmd.java \
        server/Create_Admin_Cmd.java\
        server/Create_Customer_Cmd.java\
        server/Customer_Cmd.java\
        server/Item_Lookup_Cmd.java\
        server/Remove_Customer_Cmd.java\
        server/Update_Item_Cmd.java\
	server/Server.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
        $(RM) *.class