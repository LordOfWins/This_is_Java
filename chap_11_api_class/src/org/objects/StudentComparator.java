package org.objects;

import java.util.Comparator;

class StudentComparator implements Comparator<CompareExample.Student> {
    @Override
    public int compare(CompareExample.Student a, CompareExample.Student b) {
        return Integer.compare(a.sno, b.sno);
    }
}
