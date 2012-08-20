package paw;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class SomeBean {
  private String someProperty="some property! K!";


  public String getSomeProperty() {
    return(someProperty);
  }

  public void setSomeProperty(String someProperty) {
    this.someProperty = someProperty;
  }
  
  public String someActionControllerMethod() {
    return("some-page");
  }

}
