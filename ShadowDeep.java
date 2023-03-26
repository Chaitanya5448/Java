// IN SHALLOW, CHANGES ARE REFLECTED.
// IN DEEP, CHANGES DON'T REFLECT.

// SHALLOW COPY CONSTRUCTORS
/* student(Student s1){
    marks = new int[3];
    this.name = s1.name;
} */

// Deep Copy Constructors
/* student (Student s1){
    marks = new int[3];
    this.name = s1.name;
    for(int i=0;i<marks.length();i++){
        this.marks[i] = s1.marks[i];
    }
} */
