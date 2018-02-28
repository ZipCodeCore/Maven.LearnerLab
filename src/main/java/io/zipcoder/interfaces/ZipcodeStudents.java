package io.zipcoder.interfaces;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public enum ZipcodeStudents {
    AHSON(0),
    ANTHONY(1),
    APRIL(3),
    BO(4),
    BRIAN(5),
    CAROLYNN(6),
    CORINNE(7),
    DAN(8),
    ERICB(9),
    ERICC(10),
    FRANKIE(11),
    GARRETT(12),
    GIO(13),
    JESS(14),
    JOE(15),
    JOSH(16),
    KATRINA(17),
    KAY(18),
    KEITH(19),
    KIBRET(20),
    LAWRENCE(21),
    LUIS(22),
    MADELINE(23),
    PATRICK(24),
    PETE(25),
    VINCEG(26),
    VINCEM(27),
    AMY(28),
    DYLAN(29),
    JORDAN(30),
    KATRICE(31),
    KIERAN(32),
    MITCH(33),
    OWEN(34);

    long value;

   ZipcodeStudents(long id) {
        this.value = id;
    }

    public long getID() {
        return value;
    }
}
