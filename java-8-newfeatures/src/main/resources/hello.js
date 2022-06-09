var hello = function(){
    print("Hello Nashorn");
};
hello();
print("Hello "+name);

var importFile = new JavaImporter(java.util);
var a = new importFile.ArrayList();
a.add(12);
a.add(20);
print(a);
print(a.getClass());

var importIt = new JavaImporter(java.lang.String,java.util,java.io);
with (importIt) {
    var linkedHS = new LinkedHashSet();
    linkedHS.add(new File("abc"));
    linkedHS.add(new File("hello.js"));
    linkedHS.add("india".toUpperCase());
}
print(linkedHS);

var functionDemo1 = function(){
    print("This is JavaScript function");
}
var functionDemo2 = function(message){
    print("Hello "+message);
}