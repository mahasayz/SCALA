// Scala implicitly imports java.lang, scala package and scala.Predef to every
// scala program or compilation unit

// val is like assigning final variables in Java : can't be reassigned
// var can be reassigned

// to assign type for variable, specify type after variable name separated by :
// to leave variable unassigned, use placeholder character (_)

// keeping immutability in mind, always start with val and move to var only when necessary
object Hello{
    def myFunc():String = { "Hello Matey!" }
    def main(args: Array[String]) {
      println("Hello, World");
      val list = new java.util.ArrayList[String]();
      val x:Int = 0;
      list.add(x, "1");
      
      val hexa = 0x23;
      println(hexa);
      val longVar = 12345L;
      println(longVar);
      
      val multiLine = """This is 
          a stupid way
          to print multi-line""";
      println(multiLine);
      println(multiLine.stripMargin);
      
      val name = "Mahbub";
      println(s"Hi $name");
      
      val prog = "Java";
      val alert:scala.xml.Elem = <alert>
					<message>Didn't know {name} knew {prog}</message>
					<date>{new java.util.Date()}</date>
					</alert>;
      println(alert);
      
      println(myFunc());
    }
  }
  