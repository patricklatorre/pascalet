program Input;

var someint : integer;
var somebool : boolean;
var printme : boolean;

begin
    someint := 3 * 2;
    someint := 3 / 2;
    someint := 3 mod 2;
    somebool := 3 * 2 = 6;
    somebool := 3 * 2 = 7;
    somebool := (3 * 2 = 6) and (3 * 2 = 7);

    printme := false;

    { 'wow' }
    { someint }
    { 1 }
    if (printme)
    WriteLn('wow', someint, not somebool);

end.