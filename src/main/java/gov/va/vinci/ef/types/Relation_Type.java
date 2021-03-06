
/* First created by JCasGen Tue Jun 28 15:42:22 CDT 2016 */
package gov.va.vinci.ef.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Jun 28 15:42:22 CDT 2016
 * @generated */
public class Relation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Relation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Relation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Relation(addr, Relation_Type.this);
  			   Relation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Relation(addr, Relation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Relation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.ef.types.Relation");
 
  /** @generated */
  final Feature casFeat_RunDate;
  /** @generated */
  final int     casFeatCode_RunDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRunDate(int addr) {
        if (featOkTst && casFeat_RunDate == null)
      jcas.throwFeatMissing("RunDate", "gov.va.vinci.ef.types.Relation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_RunDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRunDate(int addr, String v) {
        if (featOkTst && casFeat_RunDate == null)
      jcas.throwFeatMissing("RunDate", "gov.va.vinci.ef.types.Relation");
    ll_cas.ll_setStringValue(addr, casFeatCode_RunDate, v);}
  
  /** @generated */
  final Feature casFeat_Term;
  /** @generated */
  final int     casFeatCode_Term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTerm(int addr) {
        if (featOkTst && casFeat_Term == null)
      jcas.throwFeatMissing("Term", "gov.va.vinci.ef.types.Relation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerm(int addr, String v) {
        if (featOkTst && casFeat_Term == null)
      jcas.throwFeatMissing("Term", "gov.va.vinci.ef.types.Relation");
    ll_cas.ll_setStringValue(addr, casFeatCode_Term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Value;
  /** @generated */
  final int     casFeatCode_Value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_Value == null)
      jcas.throwFeatMissing("Value", "gov.va.vinci.ef.types.Relation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_Value == null)
      jcas.throwFeatMissing("Value", "gov.va.vinci.ef.types.Relation");
    ll_cas.ll_setStringValue(addr, casFeatCode_Value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Value2;
  /** @generated */
  final int     casFeatCode_Value2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue2(int addr) {
        if (featOkTst && casFeat_Value2 == null)
      jcas.throwFeatMissing("Value2", "gov.va.vinci.ef.types.Relation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Value2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue2(int addr, String v) {
        if (featOkTst && casFeat_Value2 == null)
      jcas.throwFeatMissing("Value2", "gov.va.vinci.ef.types.Relation");
    ll_cas.ll_setStringValue(addr, casFeatCode_Value2, v);}
    
  /** @generated */
  final Feature casFeat_Assessment;
  /** @generated */
  final int     casFeatCode_Assessment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAssessment(int addr) {
        if (featOkTst && casFeat_Assessment == null)
      jcas.throwFeatMissing("Assessment", "gov.va.vinci.ef.types.Relation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Assessment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAssessment(int addr, String v) {
        if (featOkTst && casFeat_Assessment == null)
      jcas.throwFeatMissing("Assessment", "gov.va.vinci.ef.types.Relation");
    ll_cas.ll_setStringValue(addr, casFeatCode_Assessment, v);}
 
  
  /** @generated */
  final Feature casFeat_ValueString;
  /** @generated */
  final int     casFeatCode_ValueString;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValueString(int addr) {
        if (featOkTst && casFeat_ValueString == null)
      jcas.throwFeatMissing("ValueString", "gov.va.vinci.ef.types.Relation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ValueString);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValueString(int addr, String v) {
        if (featOkTst && casFeat_ValueString == null)
      jcas.throwFeatMissing("ValueString", "gov.va.vinci.ef.types.Relation");
    ll_cas.ll_setStringValue(addr, casFeatCode_ValueString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Relation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

    casFeat_RunDate = jcas.getRequiredFeatureDE(casType, "RunDate", "uima.cas.String", featOkTst);
    casFeatCode_RunDate  = (null == casFeat_RunDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_RunDate).getCode();
 
    casFeat_Term = jcas.getRequiredFeatureDE(casType, "Term", "uima.cas.String", featOkTst);
    casFeatCode_Term  = (null == casFeat_Term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Term).getCode();
 
    casFeat_Value = jcas.getRequiredFeatureDE(casType, "Value", "uima.cas.String", featOkTst);
    casFeatCode_Value  = (null == casFeat_Value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Value).getCode();

    casFeat_Value2 = jcas.getRequiredFeatureDE(casType, "Value2", "uima.cas.String", featOkTst);
    casFeatCode_Value2  = (null == casFeat_Value2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Value2).getCode();

    casFeat_Assessment = jcas.getRequiredFeatureDE(casType, "Assessment", "uima.cas.String", featOkTst);
    casFeatCode_Assessment  = (null == casFeat_Assessment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Assessment).getCode();
 
    casFeat_ValueString = jcas.getRequiredFeatureDE(casType, "ValueString", "uima.cas.String", featOkTst);
    casFeatCode_ValueString  = (null == casFeat_ValueString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ValueString).getCode();

  }
}



    