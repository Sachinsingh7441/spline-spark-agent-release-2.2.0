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

import java.util.UUID

/**
 * = ExecutionPlan =
 *
 * @param id 
 * @param name 
 * @param discriminator 
 * @param operations 
 * @param attributes 
 * @param expressions 
 * @param systemInfo 
 * @param agentInfo 
 * @param extraInfo 
 */
case class ExecutionPlan (
  id: Option[UUID] = None,
  name: Option[String] = None,
  discriminator: Option[String] = None,
  operations: Operations,
  attributes: Option[Seq[Attribute]] = None,
  expressions: Option[Expressions] = None,
  systemInfo: NameAndVersion,
  agentInfo: Option[NameAndVersion] = None,
  extraInfo: Option[Map[String, Any]] = None
)

