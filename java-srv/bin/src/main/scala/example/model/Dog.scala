
package example.model;

import beans.BeanProperty
import javax.persistence._

@Entity
// @Table(name="dog")
case class Dog (
//    @BeanProperty
    var breed: String,

//    @BeanProperty
    var color: String
) {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id: java.lang.Long = _

  def this()
  {
    this("", "");
    id = 0L;
  }

  def this(a: java.lang.Long, b: String, c: String)
  {
    this(b, c);
    id = a;
  }

  override def toString() = f"""{"id":$id%d, "breed":"$breed%s", "color":"$color%s"}"""
}
