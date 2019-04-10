program Input2;

var someint : integer;
var somebool : boolean;

begin
    someint := 3 * 2;
    someint := 3 / 2;
    someint := 3 mod 2;
    somebool := 3 * 2 = 6;
    somebool := 3 * 2 = 7;
    somebool := (3 * 2 = 6) and (3 * 2 = 7);


    { 'wow' }
    { someint }
    { 1 }
    WriteLn('wow', -(-2) + 5, somebool);

    if (someint < 5) then
        begin
            WriteLn('statement1');
            WriteLn('statement2');
            WriteLn('statement3');
            WriteLn('statement4');
            WriteLn('statement5');
        end
end.