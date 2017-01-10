package org.pentaho.di.engine.kettlenative.impl;

import org.pentaho.di.engine.api.IExecutionContext;
import org.pentaho.di.engine.api.ITransformation;
import org.pentaho.di.repository.Repository;
import org.pentaho.di.trans.TransExecutionConfiguration;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.metastore.api.IMetaStore;

import java.util.HashMap;
import java.util.Map;

public class ExecutionContext implements IExecutionContext {

  private Map<String, Object> parameters = new HashMap<String, Object>();
  private Map<String, Object> environment = new HashMap<String, Object>();
  private ITransformation transformation;
  private TransMeta transMeta;
  private TransExecutionConfiguration executionConfiguration;
  private String[] arguments;

  public ExecutionContext( ITransformation trans ) {
    this.transformation = trans;
  }

  public ExecutionContext( ITransformation transformation, Map<String, Object> parameters,
                           Map<String, Object> environment ) {
    this.parameters = parameters;
    this.environment = environment;
    this.transformation = transformation;
  }

  @Override public Map<String, Object> getParameters() {
    return parameters;
  }

  @Override public Map<String, Object> getEnvironment() {
    return environment;
  }

  public void setParameters( Map<String, Object> parameters ) {
    this.parameters = parameters;
  }

  public void setEnvironment( Map<String, Object> environment ) {
    this.environment = environment;
  }

  @Override public ITransformation getTransformation() {
    return transformation;
  }

  public void setTransformation( ITransformation transformation ) {
    this.transformation = transformation;
  }

  public TransMeta getTransMeta() {
    return transMeta;
  }

  public void setTransMeta( TransMeta transMeta ) {
    this.transMeta = transMeta;
  }

  public void setExecutionConfiguration( TransExecutionConfiguration executionConfiguration ) {
    this.executionConfiguration = executionConfiguration;
  }

  public TransExecutionConfiguration getExecutionConfiguration() {
    return executionConfiguration;
  }

  @Override public String[] getArguments() {
    return new String[ 0 ];
  }

  public void setArguments( String[] arguments ) {
    this.arguments = arguments;
  }
}