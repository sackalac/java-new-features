package whatnew.sealedclasses;

import java.util.Date;


public non-sealed class Employee extends Person  {
    public Date getHiredDate() {
        return new Date();
    }
}
