program Input2;

var someint, i : integer;
var somebool : boolean;

function increment(number:integer) : integer;
    begin
        increment := number + 1;
    end;



procedure sendLetter(name:string; msg:string; closing:string);
    var spacing: integer;
    var spacectr: integer;

    begin
        spacing := 4;

        { top margin }
        for spacectr := 0 to spacing do
            begin
                WriteLn('');
            end;

        WriteLn('Dear ', name, ',');
        writeln('');
        WriteLn(msg);
        WriteLn('');
        WriteLn('Regards,');
        WriteLn(closing);


        { bottom margin }
        for spacectr := 0 to spacing do
        begin
            WriteLn('');
        end;
    end;




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
    WriteLn('wow' + ' ', (-2 + 5) + ' ', true = someint = someint);

    if (someint < 5) then
    begin
        for i := 0 to 5 do
            begin
                Write('looping: ');
                WriteLn('iterator = ' + i);
            end;
    end;

    senDLetter('Patrick',
                  'This is a letter to say to say goodbye.',
                  'Spongebob'
                  );

    increment(1);

    Write(increment);

    WriteLn(spacing;

end.