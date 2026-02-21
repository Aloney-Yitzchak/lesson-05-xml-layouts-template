# משימה 5: אפליקציית מונה (Counter App) 📱

## מטרת המשימה
ליצור אפליקציית מונה פשוטה שמדגימה חיבור בין XML Layout לקוד Java באמצעות `findViewById`.

---

## הוראות

### חלק א' -- השלמת ה-XML Layout (30 נקודות)

פתחו את הקובץ `activity_main.xml` והשלימו את המשימות:

1. הוסיפו `android:id` ל-TextView שמציג את המונה (השתמשו ב-`@+id/tvCounter`)
2. הוסיפו `android:id` לכפתור הוספה (השתמשו ב-`@+id/btnAdd`)
3. הוסיפו כפתור חדש להפחתה עם `id` בשם `btnSubtract` והטקסט "Subtract -1"
4. הוסיפו כפתור איפוס עם `id` בשם `btnReset` והטקסט "Reset"
5. ודאו שכל הכפתורים ממורכזים אופקית (constraints לשני הצדדים)

**טיפ:** השתמשו ב-`app:layout_constraintTop_toBottomOf` כדי לסדר את הכפתורים אחד מתחת לשני.

---

### חלק ב' -- השלמת קוד Java (40 נקודות)

פתחו את הקובץ `MainActivity.java` והשלימו את המשימות:

1. הגדירו משתנים מסוג `Button` עבור כפתור ההפחתה וכפתור האיפוס
2. חברו את כל הרכיבים עם `findViewById` (ב-`onCreate`, אחרי `setContentView`)
3. הוסיפו `OnClickListener` לכפתור ההפחתה שמפחית 1 מהמונה ומעדכן את הטקסט
4. הוסיפו `OnClickListener` לכפתור האיפוס שמחזיר את המונה ל-0
5. **בונוס:** כשהמונה חיובי, הציגו אותו בירוק. כשהוא שלילי, הציגו אותו באדום. כשהוא 0, הציגו אותו בשחור.

---

### חלק ג' -- שאלות תיאורטיות (30 נקודות)

ענו על השאלות בקובץ `QUESTIONS.md`:

1. מה תפקיד מחלקת `R`?
2. מה קורה אם קוראים ל-`findViewById` לפני `setContentView`?
3. מה ההבדל בין `View.INVISIBLE` ל-`View.GONE`?

---

## קבצים להגשה

- [ ] `app/src/main/res/layout/activity_main.xml` -- ה-Layout המושלם
- [ ] `app/src/main/java/com/example/counterapp/MainActivity.java` -- הקוד המושלם
- [ ] `QUESTIONS.md` -- תשובות לשאלות התיאורטיות

---

## קריטריונים להערכה

| קריטריון | ניקוד |
|----------|-------|
| XML Layout נכון עם כל ה-IDs והכפתורים | 30 |
| `findViewById` נכון לכל הרכיבים | 10 |
| כפתור הוספה עובד | 10 |
| כפתור הפחתה עובד | 10 |
| כפתור איפוס עובד | 10 |
| שאלות תיאורטיות | 30 |
| **בונוס: צבע לפי ערך** | **+10** |
| **סה"כ** | **100 (+10 בונוס)** |

---

## בעיות נפוצות

**בעיה:** `NullPointerException` כשלוחצים על כפתור
**פתרון:** ודאו שקראתם ל-`findViewById` **אחרי** `setContentView` ושה-`id` ב-XML תואם

**בעיה:** `setText` עם מספר גורם לקריסה
**פתרון:** השתמשו ב-`String.valueOf(counter)` ולא ב-`counter` ישירות

**בעיה:** הכפתורים לא ממורכזים
**פתרון:** הוסיפו constraints לשני הצדדים: `constraintStart_toStartOf="parent"` ו-`constraintEnd_toEndOf="parent"`

---

## משאבים

- [Layouts - Android Developers](https://developer.android.com/develop/ui/views/layout/declaring-layout)
- [ConstraintLayout](https://developer.android.com/develop/ui/views/layout/constraint-layout)
- [findViewById Reference](https://developer.android.com/reference/android/app/Activity#findViewById(int))

---

בהצלחה! 🚀
