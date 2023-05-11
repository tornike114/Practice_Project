package StepObject;

import PageObject.HomepagePage;

public class HomepageSteps extends HomepagePage {
    public HomepagePage click_search(){
        srch_btn.click();
        return this;
    }
    public HomepagePage srch_item(String item){
        open_srch_out.setValue(item);
        return this;
    }
}
