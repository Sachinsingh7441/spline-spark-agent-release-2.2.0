/**
 * OpenLineage
 * OpenLineage is an open source **lineage and metadata collection API** for the data ecosystem.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package za.co.absa.spline.producer.model.openlineage.v0_3_1


/**
 * A Job Facet
 *
 * @param _producer URI identifying the producer of this metadata. For example this could be a git url with a given tag or sha for example: '''https://github.com/OpenLineage/OpenLineage/blob/v1-0-0/client'''
 * @param _schemaURL The JSON Pointer (https://tools.ietf.org/html/rfc6901) URL to the corresponding version of the schema definition for this facet for example: '''https://openlineage.io/spec/1-0-2/OpenLineage.json#/$defs/BaseFacet'''
 */
case class JobFacet (
  _producer: String,
  _schemaURL: String
)

