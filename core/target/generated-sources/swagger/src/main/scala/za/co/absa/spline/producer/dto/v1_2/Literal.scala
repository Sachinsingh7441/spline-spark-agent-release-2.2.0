/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package za.co.absa.spline.producer.dto.v1_2


/**
 * = Literal =
 *
 * @param id 
 * @param dataType 
 * @param extra 
 * @param value 
 */
case class Literal (
  id: String,
  dataType: Option[Any] = None,
  extra: Option[Map[String, Any]] = None,
  value: Any
)

