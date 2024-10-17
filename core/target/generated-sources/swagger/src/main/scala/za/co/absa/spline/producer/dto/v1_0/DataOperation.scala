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
package za.co.absa.spline.producer.dto.v1_0


/**
 * = DataOperation =
 *
 * @param id 
 * @param childIds 
 * @param schema 
 * @param params 
 * @param extra 
 */
case class DataOperation (
  id: Integer,
  childIds: Option[Seq[Any]] = None,
  schema: Option[Any] = None,
  params: Option[Map[String, Any]] = None,
  extra: Option[Map[String, Any]] = None
)

