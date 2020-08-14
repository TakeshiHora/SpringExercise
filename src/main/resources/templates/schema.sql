
CREATE TABLE IF NOT EXISTS weather (
    weather_id INT PRIMARY KEY,
    activeTime DATE(20),
    warningType VARCHAR(50),
    volcanoName VARCHAR(50),
    ExpectedAshFallTimeRegion1 DATE(20),
    warningCode1 INT(10),
    localGovernment1 VARCHAR(50),
    ExpectedAshFallTimeRegion1 DATE(20),
    warningCode2 INT(10),
    localGovernment2 VARCHAR(50),
    ExpectedAshFallTimeRegion2 DATE(20),
    warningCode2 INT(10),
    localGovernment3 VARCHAR(50),
    ExpectedAshFallTimeRegion3 DATE(20),
    warningCode4 INT(10),
    localGovernment4 VARCHAR(50),
    ExpectedAshFallTimeRegion4 DATE(20),
);