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
 * = Expressions =
 *
 * @param functions 
 * @param constants 
 */
case class Expressions (
  functions: Option[Seq[FunctionalExpression]] = None,
  constants: Option[Seq[Literal]] = None
)

