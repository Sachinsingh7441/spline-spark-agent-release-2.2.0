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
package za.co.absa.spline.producer.dto.v1_1


/**
 * = Operations =
 *
 * @param write 
 * @param reads 
 * @param other 
 */
case class Operations (
  write: WriteOperation,
  reads: Option[Seq[ReadOperation]] = None,
  other: Option[Seq[DataOperation]] = None
)

