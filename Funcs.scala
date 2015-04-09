

/**
 * @author ala
 */
object Funcs {
    def main(args: Array[String]) {
      val evenNumbers = List(2, 4, 6, 8, 10);
      val result = evenNumbers.foldLeft(0) { (a: Int, b: Int) => a + b};
      println(result);
      
      println(evenNumbers.foldLeft(1) { _ * _ });
      
//      BREAK implementation
      val breakException = new RuntimeException("break exception");
      
      def breakable(op: => Unit) {
        try {
          op;
        } catch { case e: RuntimeException => println(e.getMessage) }
      }
      
      def break = throw breakException;
      
      def install = {
        val env = System.getenv("SCALA_HOME");
        if (env == null) break;
        println("found scala home");
      }
      
      breakable(install);
      
    }
}