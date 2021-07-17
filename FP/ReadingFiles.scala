import java.io.File
import scala.io.Source


object ReadingFiles extends App {

 val filePath : String = "path_to_file"

 def open(path : String) = new File(path)

 implicit class RichFile(file : File) {
    def read() : Iterator[String] = Source.fromFile(file).getLines()
  }

 val readLikeABoss = open(filePath).read()
}
