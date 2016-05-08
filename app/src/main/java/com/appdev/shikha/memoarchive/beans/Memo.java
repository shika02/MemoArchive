package com.appdev.shikha.memoarchive.beans;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by shikha on 8/5/16.
 */
public class Memo  extends RealmObject{
    public Memo(String what,long added, long when ,boolean completed) {
        this.added = added;
        this.completed = completed;
        this.what = what;
        this.when = when;
    }

    private String what;

    @PrimaryKey
    private long added;
    private long when;
    private boolean completed;

    public Memo() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public long getAdded() {
        return added;
    }

    public void setAdded(long added) {
        this.added = added;
    }

    public long getWhen() {
        return when;
    }

    public void setWhen(long when) {
        this.when = when;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
