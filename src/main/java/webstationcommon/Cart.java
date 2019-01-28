package webstationcommon;

import java.util.Collection;

public class Cart {

    private int id;
    private User user;
    private Collection<Integer> flatIds;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<Integer> getFlatIds() {
        return flatIds;
    }

    public void setFlatIds(Collection<Integer> flatIds) {
        this.flatIds = flatIds;
    }
}
